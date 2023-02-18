package application;
import java.util.Scanner;
import java.util.Random;
public class mathTurtor {
    public static void main(String[] args){
        int num1;
        int num2;
        int sum;
        int useranswer;
        Scanner keyboard = new Scanner(System.in);
        Random ran = new Random();
        num1 = ran.nextInt(100);
        num2 = ran.nextInt(100);
        System.out.println("What is the answer to the following problem?");
        System.out.println(num1 + "+" + num2 + "= ?");
        sum = num1 + num2;
        useranswer = keyboard.nextInt();
        if (useranswer == sum)
            System.out.println("Right");
        else{
            System.out.println("wrong");
        }
    }
}
