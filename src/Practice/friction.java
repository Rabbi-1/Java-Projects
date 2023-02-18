package Practice;
import java.util.Scanner;
public class friction {
    public static void main(String[] args){
        int n, c , fact = 1;
        System.out.println("Enter num: ");
        Scanner keyboard = new Scanner(System.in);
        n = keyboard.nextInt();
        if(n < 0){
            System.out.println("Eneter non negative");
        }else {
            for (c = 1; c <= n; c++){
                fact = fact*c;
                System.out.println("Fric " + n + " is " + fact);
            }
        }
    }
}
