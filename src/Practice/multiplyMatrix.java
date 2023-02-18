package Practice;
import java.util.Scanner;
public class multiplyMatrix {
    public static void main(String[] args){
        int m, n, p, q;
        int sum = 0;
        int c, d, k;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");
        m = keyboard.nextInt();
        n = keyboard.nextInt();
        int first[][] = new int[m][n];
        System.out.println("Enter the elements of first matrix");
        for(c = 0; c < m; c++)
            for(d = 0; d < n; d++)
                first[c][d] = keyboard.nextInt();
        System.out.println("Enter the number of rows and columns of second matrix");
        p = keyboard.nextInt();
        q = keyboard.nextInt();
        if(n != p)
            System.out.println("Matrices with entered orders can't be multiplied with each other.");
        else
        {
            int second[][] = new int[p][q];
            int multiply[][] = new int[m][q];
        }
    }
}
