package application2;
import model.Stock;
import model.StockPurchase;
import java.util.Scanner;
import java.text.DecimalFormat;

public class StockTrade {
    public static void main(String[] args){
        int shareToBuy;
        Stock xyzCompany = new Stock("xyz", 9.42);
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        System.out.println("XYZ Company's stock is currently $" + dollar.format(xyzCompany.getSharePrice()) +
                " per share.");
        System.out.println("How many shares do you want to buy?");
        shareToBuy = keyboard.nextInt();
        StockPurchase buy = new StockPurchase(xyzCompany, shareToBuy);
        System.out.println("Cost of the stock: $" + dollar.format(buy.getCost()));
    }
}
