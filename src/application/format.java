package application;
import java.text.DecimalFormat;
public class format {
    public static void main(String[] args){
        double number1 = 0.1666666666667;
        double number2 = 1.6666666666667;
        double number3 = 16.6666666666667;
        DecimalFormat formatter = new DecimalFormat("000.000");
        System.out.println(formatter.format(number2));
        }
    }

