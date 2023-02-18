package application;
import java.util.Scanner;
import java.text.DecimalFormat;
public class CorpSales {
    public static void main (String[] args) {
        final int DIVS = 3;
        final int QTRS = 4;
        double totalScales = 0.0;
        double[][] sales = new double[DIVS][QTRS];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program will calculate the total sales of");
        System.out.println("all the company's divisions. Enter the following sales data: ");
        for (int div = 0; div < DIVS; div++) {
            for (int qtr = 0; qtr < QTRS; qtr++) {
                System.out.println("Division " + (div + 1) + (", Quater " + (qtr + 1) + ": $"));
                sales[div][qtr] = keyboard.nextDouble();
            }
            System.out.println();
        }
        for(int div = 0; div < DIVS; div++){
            for (int qtr = 0; qtr < QTRS; qtr++){
                totalScales += sales[div][qtr];
            }
        }
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        System.out.println("THe total sacles for the company " + "are $" + dollar.format(totalScales));
    }
}
