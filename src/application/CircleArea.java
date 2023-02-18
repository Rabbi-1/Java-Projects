package application;
import java.util.Scanner;
import java.text.DecimalFormat;
public class CircleArea {
    public static void main(String[] args){
        double radius;
        double area;
        String input;
        char choice;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.00");
        do{
            System.out.print("Enter radius: ");
            radius = keyboard.nextInt();
            keyboard.nextLine();
            area = Math.PI * radius * radius;
            System.out.println("The area is " + fmt.format(area));
            System.out.println("Again Y or N");
            input = keyboard.nextLine();
            choice = input.charAt(0);
        } while (Character.toUpperCase(choice) == 'Y');
    }
}
