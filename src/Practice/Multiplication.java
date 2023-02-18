package Practice;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        int n, c;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("MUltiplation inter");
        n = keyboard.nextInt();
        for (c=1; c <= 10; c++)
            System.out.println(n+"*"+c+" = "+(n*c) );
    }
}
