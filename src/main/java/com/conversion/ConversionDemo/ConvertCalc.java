package com.conversion.ConversionDemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
public class ConvertCalc {

    @Autowired
    private RestTemplate restTemplate;
    private HashMap<String,Coin> bitkubCoinsHashMap= new HashMap<>();
    private  HashMap<String,Coin> zebpayCoinsHashMap= new HashMap<>();

    public  HashMap<String,Coin> getBitkubCoin(String coin){
        HashMap<String,Coin> bmap= new HashMap<>();
        System.out.println("beforebitkub");
        ObjectMapper mapper = new ObjectMapper();
        String resp=restTemplate.getForObject("http://BITKUB-UAT-DEV/bitkub/ticker/"+ConvertConstants.THB_+coin,String.class);
        try {
            bmap=mapper.readValue(resp,
                    new TypeReference<HashMap<String,Coin>>(){});
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("afterbitkub"+bmap);
        return bmap;
    }

    public  HashMap<String,Coin> getZebPayCoin(String coin){
        HashMap<String,Coin> zmap= new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        System.out.println("beforezebpay");
        String resp= restTemplate.getForObject("http://ZEBPAY-UAT/zebpay/ticker/"+coin+"-"+ConvertConstants.INR,String.class);
        try {
            zmap=mapper.readValue(resp,
                    new TypeReference<HashMap<String,Coin>>(){});
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("afterzebpay"+zmap);
        return  zmap;
    }

    public HashMap<String, String> calculateExchangeRate(HashMap<String, Coin> bitCoin, HashMap<String, Coin> zebCoins, String coin) {

        HashMap<String, String> convertMap=new HashMap<>();

        Coin bitkubCoins=bitCoin.get(ConvertConstants.THB_+coin);
        System.out.println("bitkubCoins"+bitkubCoins.getLast());
        Coin zebpayCoins=zebCoins.get(coin+"-"+ConvertConstants.INR);
        System.out.println("zebpayCoins"+zebpayCoins.getSell());
        // Coin b=bitkubCoins.getCoins().get(0);
       //  Coin z=zebpayCoins.getCoins().get(0);

         Double bDouble=bitkubCoins.getLast();
        System.out.println("BitLast traded::"+bDouble);
         Double zDouble=zebpayCoins.getSell();
        System.out.println("Zeb pay sell price::"+zDouble);
         if(zDouble>0 && bDouble>0) {
             Double xchangeRate = zDouble.doubleValue() /bDouble.doubleValue();
             convertMap.put(coin,xchangeRate.toString());

         }
return  convertMap;


    }
}
