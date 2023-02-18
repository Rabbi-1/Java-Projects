package application;
import java.util.Scanner;
public class PassArray {
    public static void main(String[] args){
        final int ARRAY_SIZE = 4;
        int[] numbers = new int[ARRAY_SIZE];
        getValues(numbers);
        System.out.println("Here are the numbers that you entered: ");
        showArray(numbers);
    }
    private static void getValues (int[] array){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a series of " + array.length + "number.");
        for (int index = 0; index < array.length; index++){
            System.out.println("Enter number " + (index + 1) + ": ");
            array[index] = keyboard.nextInt();
        }
    }
    public static void showArray(int[] array){
        for (int index = 0; index < array.length; index++)
            System.out.print(array[index] + " ");

    }
}
