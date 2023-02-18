package Practice;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
        int practicegiven, practicemarked;
        practicegiven = 40;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Give score: ");
        practicemarked = keyboard.nextInt();
        if(practicegiven > practicemarked){
            System.out.println("Welcome");
        }else
            System.out.println("Not welcome");
    }
}
