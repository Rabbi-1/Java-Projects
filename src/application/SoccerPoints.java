package application;
import java.util.Scanner;
public class SoccerPoints {
    public static void main (String [] args){
        int points = 0;
        int totalpoints = 0;
        String end = "Done";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of points your team");
        System.out.println("has earned for each game this season.");
        System.out.println("Enter Done when finished.");
        System.out.println();
        System.out.println("Enter game points or Done is entered.");
        points = keyboard.nextInt();
        while (points != -1){
            totalpoints += points;
            System.out.println("Enter game points or -1 to end: ");
            points = keyboard.nextInt();
            System.out.println("The total points are " + totalpoints);

        }
    }

}
