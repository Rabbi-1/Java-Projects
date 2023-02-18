package application;
import java.util.Scanner;
public class PayArray {
    public static void main (String[] args){
        final int EMPLOYEES = 5;
        double payRate;
        double grossPay;
        int[] hours = new int[EMPLOYEES];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the hours worked by " + EMPLOYEES + " employees who all earn the same hourly rate");
        for (int index = 0; index < EMPLOYEES; index++){
            System.out.println("Employee #" + (index + 1) + ": ");
            hours[index] = keyboard.nextInt();
        }
        System.out.println("Hourly pay rate: ");
        payRate = keyboard.nextDouble();
        System.out.println("Grosspay: ");
        for (int index = 0; index < EMPLOYEES; index++){
            grossPay = hours[index] * payRate;
            System.out.println("Employee #" + (index + 1) + ": $" + grossPay);
        }
    }
}
