package application;

public class Contribution {
    public static void main (String[] args){
        double monthlyPay = 6000.0;
        double contribution;
        // Calculate an display a 5% contribution
        contribution = monthlyPay * 0.05;
        System.out.println("5 percent is $" + contribution + " per month");
        //8%
        contribution = monthlyPay * 0.08;
        System.out.println("8 persent is $" + contribution + " per month.");
        //10%
        contribution = monthlyPay * 0.1;
        System.out.println("10 percent is $" + contribution + " per month");

    }
}
