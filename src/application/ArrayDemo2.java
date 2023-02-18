package application;
import java.util.Scanner;
public class ArrayDemo2 {
    public static void main(String[] args){
        final int EMPLOYEE = 3;
        int[] hours = new int[EMPLOYEE];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the hours worked by " + EMPLOYEE + " employees");
        for (int index = 0; index < EMPLOYEE; index++){
            System.out.println("Employee " + (index + 1) + ": ");
            hours[index] = keyboard.nextInt();
        }
        System.out.println("The hours you entered are: ");
        for (int index = 0; index < EMPLOYEE; index++)
        System.out.println(hours[index]);
    }
}
