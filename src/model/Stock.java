package model;

public class Stock {
    private String symbol;
    private double sharePrice;
    public Stock(String sym, double price){
        symbol = sym;
        sharePrice = price;
    }
    public Stock(String sym){
        symbol = sym;
    }
    public Stock(double price) {
        sharePrice = price;
    }

    public Stock(){}

    public Stock(Stock obj){
        symbol = obj.symbol;
        sharePrice = obj.sharePrice;
    }

    public String getSymbol(){
        return symbol;
    }
    public double getSharePrice(){
        return sharePrice;
    }
    public String toString(){
        String str = "Trading symbol: " + symbol + "\nShare price: " + sharePrice;
        return str;
    }
}
