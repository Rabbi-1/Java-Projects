package application;
import java.util.Scanner;
public class TempTest {
    public static void main (String[] args){
        final double MAX_TEMP = 102.5;
        double temperature;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the substance's Celsius temperature: ");
        temperature = keyboard.nextDouble();
        while (temperature > MAX_TEMP){
            System.out.println("The temperature is too high. Turn the");
            System.out.println("thermostat down and wait 5 minutes.");
            System.out.println("Then, take the Celsius temperature again");
            System.out.print("and enter it here: ");
            temperature = keyboard.nextDouble();
        }
        System.out.println("The temperature is acceptable.");
        System.out.println("Check it again in 15 minutes.");
    }
}
