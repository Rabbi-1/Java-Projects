package application;

import model.Stock;

public class StockCompare {
    public static void main(String[] args){
        Stock box = new Stock("xyz",12.0);
        Stock box1 = new Stock("asa", 22.0);
        if(box.equals(box1))
            System.out.println(" equal");
        else
            System.out.println("not equal");
    }
}
