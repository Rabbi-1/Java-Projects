package model;

public class thisStock {
    private String symbol;
    private double sharePrice;
    public thisStock(String symbol, double sharePrice){
        this.sharePrice = sharePrice;
        this.symbol = symbol;
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
