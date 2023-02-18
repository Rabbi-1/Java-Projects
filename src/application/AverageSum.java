package application;
import java.util.Scanner;
public class AverageSum {
    public static void main(String[] args) {
        final int PPL = 3;
        int[] people = new int[PPL];
        int sum;
        int average;
        Scanner keyboard = new Scanner(System.in);
        for (int index = 0; index < people.length; index++) {
            System.out.println("Employee " + (index + 1) + ": ");
            people[index] = keyboard.nextInt();
        }
        sum = people[0] + people[1] + people[2];
        average = sum / people.length;
        System.out.println("Average: " + average);
        System.out.println("Sum: " + sum);

    }
}
