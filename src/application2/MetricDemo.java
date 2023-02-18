package application2;
import model.Metric;

import java.util.Scanner;
import java.text.DecimalFormat;
public class MetricDemo {
    public static void main (String[] args){
        double miles;
        double kilos;
        DecimalFormat fmt = new DecimalFormat("0.00");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a distance in miles.");
        miles = keyboard.nextDouble();
        kilos = Metric.kilometersToMiles(miles);
        System.out.println(fmt.format(miles) + " miles equal " + fmt.format(kilos) + " kilometers.");
        System.out.println("Enter a distance in kilometer:");
        kilos = keyboard.nextDouble();
        miles = Metric.kilometersToMiles(kilos);
        System.out.println(fmt.format(kilos) + " kilometers equals " + fmt.format(miles) + " miles.");
    }
}
