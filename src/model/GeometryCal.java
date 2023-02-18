package model;
import java.util.Scanner;
public class GeometryCal {
    public static double areaOfCircle(double radius){
        return Math.PI * radius * radius;
    }
    public static double areaOfRectangle(double length, double height){
        return length * height;
    }
    public static double areaOfTriangle(double base, double h){
        return 0.5 * base * h;
    }

    public static void calculateCircleArea(){
        double radius;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the radius?");
        radius = keyboard.nextDouble();
        System.out.print("Area: " + GeometryCal.areaOfCircle(radius));
    }
    public static void calculateRectangleArea(){
        double length;
        double width;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Length: ");
        length = keyboard.nextDouble();
        System.out.print("Width: ");
        width = keyboard.nextDouble();
        System.out.print("The area is " + GeometryCal.areaOfRectangle(length, width));
    }
    public static void calculateTriangleArea(){
        double base;
        double height;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Base: ");
        base = keyboard.nextDouble();
        System.out.print("Height: ");
        height = keyboard.nextDouble();
        System.out.print("Area: " + GeometryCal.areaOfTriangle(base, height));
    }
}
