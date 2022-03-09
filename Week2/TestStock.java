package com.company;

public class TestStock {

    public static Stock[] stocks = new Stock[10];
    public static Stock[] myStocks = new Stock[5];

    public static void main(String[] args) {
        createAllStock();
        listStocks();
        System.out.println("----------------");
        buyAStockWithGivenSymbol("aaa1");
        buyAStockWithGivenSymbol("aaa3");
        buyAStockWithGivenSymbol("aaa4");
        listMyStocks();
        buyAStockWithMinPrice();
        listMyStocks();
        sellMaxGain();
    }

    public static void createAllStock(){ //It is not written, but we first need to create stocks.
        for (int i = 0; i < 10; i++) {
            Stock s = new Stock("aaa"+i,"A"+i,1000+i);
            stocks[i] = s;
        }
    }

    public static void listStocks(){
        for (int i = 0; i < stocks.length; i++) {
            if(stocks[i] != null){
                System.out.println(stocks[i]);
            }
        }
    }

    public static void listMyStocks(){
        for (int i = 0; i < myStocks.length; i++) {
            if(myStocks[i] != null){
                System.out.println(myStocks[i]);
            }
        }
    }

    public static void buyAStockWithGivenSymbol(String symbol){//We will take this symbol in the main method.
        Stock foundIt = null;
        for (int i = 0; i<stocks.length; i++){
            if(stocks[i].getSymbol().equals(symbol)){
                foundIt = stocks[i];
                System.out.println(stocks[i]);
                break;
            }
        }
        System.out.println(foundIt);

        if(foundIt != null) {
            for (int i = 0; i < myStocks.length; i++) {
                if (myStocks[i] == null) {
                    myStocks[i] = foundIt;
                    System.out.println(myStocks[i]);
                    break;
                }
            }
        }

    }//We need to set references. If you create a new Stock, changes in the stock list will not affect your same Stock.
    //When we change something from the stock, it needs to change in everywhere.

    public static void buyAStockWithMinPrice(){
        Stock minStock = stocks[0];
        double minPrice = stocks[0].getCurrentPrice();
        for (int i = 1; i < stocks.length; i++) {
            if(stocks[i].getCurrentPrice() < minPrice){
                minStock = stocks[i];
                minPrice = stocks[i].getCurrentPrice();
            }
        }

        for (int i = 0; i < myStocks.length; i++) {
            if(myStocks[i] == null){
                myStocks[i] = minStock;
                break;
            }
        }
    }

    public static void sellMaxGain(){//Sell means find it and it to null. That index will be null, so we can set new stock on that location.
        Stock maxGainStock = myStocks[0];
        int maxGainIndex = 0;//We need to find this index.
        for (int i = 1; i < myStocks.length; i++) {
            if(myStocks[i] != null){
                if(maxGainStock.getChangePercent() < myStocks[i].getChangePercent()){
                    maxGainStock = myStocks[i];
                    maxGainIndex = i;
                }
            }
        }
        myStocks[maxGainIndex] = null;
    }
}