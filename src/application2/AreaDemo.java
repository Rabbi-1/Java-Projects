package application2;
import model.Area;

import java.util.Scanner;
public class AreaDemo {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which shape would like to find the are for? (Circle, Rectangles, or Cylinder");
        String shape = keyboard.nextLine();
        if (shape.equalsIgnoreCase("Circle")){
            System.out.println("What is the radius of the circle?");
            double raidus = keyboard.nextDouble();
            double area = Area.getArea(raidus);
        } else if (shape.equalsIgnoreCase("Rectangles")){
            System.out.println("What is the lenght of the circle?");
            int l = keyboard.nextInt();
            System.out.println("What is the width of the circle?");
            int w = keyboard.nextInt();
            double area = Area.getArea(l, w);
        } else if (shape.equalsIgnoreCase("Cylinder")){
            System.out.println("What is the radius of the cylinder?");
            double radius = keyboard.nextDouble();
            System.out.println("What is the height of the cylinder?");
            double height = keyboard.nextDouble();
            double area = Area.getArea(radius, height);
            System.out.println("Area:" + area);
        } else
            System.out.println("Unknown Shape");
    }
}
