package model;

public class StockPurchase {
    private Stock stock;
    private int shares;

    public StockPurchase(Stock stock, int shares){
        this.stock = new Stock(stock);
        this.shares = shares;
    }
    public Stock getStock(){
        return new Stock(stock);
    }
    public int getShares(){
        return shares;
    }
    public double getCost(){
        return shares * stock.getSharePrice();
    }
}
