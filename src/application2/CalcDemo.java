package application2;
import model.GeometryCal;

import java.util.Scanner;
public class CalcDemo {
    public static void main(String[] args){
        int choice;
        do{
            choice = getMenu();
            if (choice == 1){
                GeometryCal.calculateCircleArea();
            }else if(choice == 2){
                GeometryCal.calculateRectangleArea();
            }else if(choice == 3){
                GeometryCal.calculateTriangleArea();
            }
            else if(choice == 4){
                System.out.println("Thanks for using");
            }
        }
        while (choice !=4);
    }
    public static int getMenu(){
        int userChoice;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1 for Circle");
        System.out.println("2 for Rectangle");
        System.out.println("3 for Triangle");
        System.out.println("4 is quit");
        System.out.println("Enter num between 1-4");
        userChoice = keyboard.nextInt();
        while(userChoice < 1 || userChoice > 4){
            System.out.println("No good");
        }
        return userChoice;
    }
}
