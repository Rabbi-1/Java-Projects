package application;
import java.util.Scanner;
public class CupConverter {
    public static void main(String[] args){
        double cups;
        double ounce;
        cups = getCups();
        ounce = cupToOunces(cups);
        displayResult(cups, ounce);
    }
    public static double getCups(){
        double numcups;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program converts measurements in cups" +
                "to fluid ounces. For your reference the formula is: 1 cup = 8 fluid ounces\n\n" +
                "Enter The number of cups.");
        numcups = keyboard.nextDouble();
        return numcups;
    }
    public static double cupToOunces(double numCups){
        return numCups * 8.0;
    }
    public static void displayResult(double cups, double ounces){
        System.out.println(cups + " cups equals " + ounces + " fluid ounces.");
    }
}
