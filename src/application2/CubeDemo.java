package application2;
import model.Cube;

import java.util.Scanner;
public class CubeDemo {
    public static void main(String[] args){
        double length;
        double width;
        double height;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the following dimensions of a cube: ");
        System.out.println("Length: ");
        length = keyboard.nextDouble();
        System.out.println("Width: ");
        width = keyboard.nextDouble();
        System.out.println("Height: ");
        height = keyboard.nextDouble();
        Cube myCube = new Cube(length, width, height);
    }
}
