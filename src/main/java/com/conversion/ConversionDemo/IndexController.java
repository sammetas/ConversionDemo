package com.conversion.ConversionDemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	@Autowired
 	private ConvertCalc convertCalc;
	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		model.put("message", "Welcome Page !!");
		return "index";
	}
	
	@RequestMapping("/next")
	public String calculate(Map<String, Object> model, @RequestParam String coin) {
		System.out.println("in next ");
		System.out.println(coin);

    	HashMap<String,Coin> bitCoin=convertCalc.getBitkubCoin(coin);
    	HashMap<String,Coin> zebCoins=convertCalc.getZebPayCoin(coin);
		if(bitCoin.size()>0&&zebCoins.size()>0) {
			HashMap<String, String> xchangeRate = convertCalc.calculateExchangeRate(bitCoin, zebCoins, coin);
			System.out.println("xchangeRate::"+xchangeRate);
			model.put("message", "You are in new page !!");
			model.put("listMap",xchangeRate);
			return "next";
		}else{
			return  "error";
		}

	}

}