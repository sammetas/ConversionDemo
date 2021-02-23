package com.conversion.ConversionDemo;

class Coin{
    private String coin;
    private  int id;

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    private double change;
    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    private  double buy;
    private double sell;
    private  double last;
    private  String pair;
    private double high24hr;

    public int getId() {
        return id;
    }

    public double getLast() {
        return last;
    }

    public void setLast(double last) {
        this.last = last;
    }

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    private double low24hr;
    private double prevClose;
    private double prevOpen;
    private double baseVolume;
    private double lowestAsk;
    private double highestBid;

    public void setId(int id) {
        this.id = id;
    }

    public double getHigh24hr() {
        return high24hr;
    }

    public void setHigh24hr(double high24hr) {
        this.high24hr = high24hr;
    }

    public double getLow24hr() {
        return low24hr;
    }

    public void setLow24hr(double low24hr) {
        this.low24hr = low24hr;
    }

    public double getPrevClose() {
        return prevClose;
    }

    public void setPrevClose(double prevClose) {
        this.prevClose = prevClose;
    }

    public double getPrevOpen() {
        return prevOpen;
    }

    public void setPrevOpen(double prevOpen) {
        this.prevOpen = prevOpen;
    }

    public double getBaseVolume() {
        return baseVolume;
    }

    public void setBaseVolume(double baseVolume) {
        this.baseVolume = baseVolume;
    }

    public double getLowestAsk() {
        return lowestAsk;
    }

    public void setLowestAsk(double lowestAsk) {
        this.lowestAsk = lowestAsk;
    }

    public double getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(double highestBid) {
        this.highestBid = highestBid;
    }












    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }





}