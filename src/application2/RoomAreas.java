package application2;
import model.Rectangle;
import java.util.Scanner;
public class RoomAreas {
    public static void main (String[] args){
        double number;
        double totalArea;
        Scanner keyboard = new Scanner(System.in);
        Rectangle kitches = new Rectangle();
        Rectangle bedroom = new Rectangle();
        Rectangle den = new Rectangle();

        System.out.println("What is the Kitchen's length?");
        number = keyboard.nextDouble();
        kitches.setLength(number);

        System.out.println("What is the kitchen's width?");
        number = keyboard.nextDouble();
        kitches.setWidth(number);

        System.out.println("What is the Bedroom's length?");
        number = keyboard.nextDouble();
        bedroom.setLength(number);

        System.out.println("What is the Bedroom's width?");
        number = keyboard.nextDouble();
        bedroom.setWidth(number);

        System.out.println("What is den's length?");
        number = keyboard.nextDouble();
        den.setLength(number);

        System.out.println("What is the den's width?");
        number = keyboard.nextDouble();
        den.setWidth(number);

        totalArea = kitches.getArea() + bedroom.getArea() + den.getArea();
        System.out.println("The total area of the rooms is " + totalArea);
        }

    }

