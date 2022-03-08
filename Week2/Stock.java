package com.company;

import java.util.Random;

public class Stock {
    //Question didn't say anything about private or public, first, let's set it private.
    private String symbol;
    private String name;
    
    private double previousClosingPrice;//We don't know anything about its type, We just know that it will be a number.
    private double currentPrice;
	//Most of the time money will be double. But, we will look at it in the next steps.

    public Stock(String symbol, String name, double previousClosingPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        Random rnd = new Random();
        double change = rnd.nextDouble();
        //double change = Math.random();
        boolean plusOrMinus = rnd.nextBoolean(); // true or false
        if(plusOrMinus){//true means + sign
            currentPrice = previousClosingPrice + change*previousClosingPrice;
        }else{
            currentPrice = previousClosingPrice - change*previousClosingPrice;
        }//We wanted the current price to be random.
    }

    //It didn't say anything about public or private. However, if we want to use it in the test class, we need to make it public.
    public double getChangePercent(){
        return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
}