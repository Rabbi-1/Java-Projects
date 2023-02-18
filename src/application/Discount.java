package application;

public class Discount {
    public static void main (String[] args){
        double regularPrice = 100.0;
        double discount;
        double salePrice;

        //discount 20%
        discount = regularPrice * 0.2;
        //sale price
        salePrice = regularPrice - discount;

        System.out.println("Regular price: $" + regularPrice);
        System.out.println("Discount amount $" + discount);
        System.out.println("Sale price: $" + salePrice);
    }
}
