package application;
import java.util.Scanner;
public class customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.print("Enter a customer number in the form LLLNNNN (LLL = letters and NNNN = numbers): ");
        input = sc.next();

        if (isValid(input)) {
            System.out.println("That's a valid customer number.");
        } else {
            System.out.println("That is not the proper format of a customer number. Here is an example: ABC1234");
        }
    }

    private static boolean isValid(String custNumber) {
        boolean goodSoFar = true;
        int i = 0;

        if (custNumber.length() != 7) {
            goodSoFar = false;
        }

        while (goodSoFar && i < 3) {
            if (!Character.isLetter(custNumber.charAt(i))) {
                goodSoFar = false;
            }
            i++;
        }

        while (goodSoFar && i < 7) {
            if (!Character.isDigit(custNumber.charAt(i))) {
                goodSoFar = false;
            }
            i++;
        }

        return goodSoFar;
    }
}

