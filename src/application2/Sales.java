package application2;
import model.SalesData;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Sales {
    public static void main (String[] args){
        final int ONE_WEEK = 7;
        double [] sales = new double[ONE_WEEK];
        getValues(sales);
        SalesData week = new SalesData(sales);
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        System.out.println("Total sales were $" + dollar.format(week.getTotal()) +
                "\nThe average sales were $" + dollar.format(week.getAverage()) +
                "\n The highest sales were $" + dollar.format(week.getHighest()) +
                "\n The lowest sakes were $" + dollar.format(week.getLowest()));
    }
    private static void getValues(double[] array){
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter the sales for day " + (i + 1) + ".");
            array[i] = keyboard.nextDouble();
        }
    }
}
