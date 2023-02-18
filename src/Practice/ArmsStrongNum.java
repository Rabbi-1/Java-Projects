package Practice;
import java.util.Scanner;
public class ArmsStrongNum {
    public static void main(String[] args){
        String string, sub;
        int length;
        Scanner keybord = new Scanner(System.in);
        System.out.println("Enter String to print substring");
        string = keybord.nextLine();
        System.out.println("Substrings of \""+string+"\" are :-");
        for(int c = 0; c < string.length(); c++){
            for(int i = 1; i < string.length() - c; i++){
                sub = string.substring(c, c+1);
                System.out.println(sub);
            }
        }
    }
}
