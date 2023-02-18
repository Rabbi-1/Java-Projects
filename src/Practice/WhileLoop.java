package Practice;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] agrs){
        int n;
        Scanner keyboard = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number");
            n = keyboard.nextInt();
            if (n != 0){
                System.out.println("You entered: " + n);
                continue;
            }else
                break;
        }
    }
}
