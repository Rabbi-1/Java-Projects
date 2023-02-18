package application;
import java.util.Scanner;
public class LoanQialifier {
    public static void main (String[] args){
        double salary;
        double yearOnJob;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your annual salary.");
        salary = keyboard.nextDouble();
        System.out.println("Enter the number of years at your current jobs.");
        yearOnJob = keyboard.nextDouble();

        if (salary >= 30000){
            if (yearOnJob >= 2){
                System.out.println("You qualify for the loan.");
            }
            else if (yearOnJob < 2){
                System.out.println("You must have been on your current job for at least two years to qualify.");
            }
            else {
                System.out.println("You must earn at least $30,000 per year to qualify.");
            }
        }
        }
    }

