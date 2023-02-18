package application;

public class ValueReturn {
    public static void main(String[] args){
        int total, value1 = 20, value2 = 40;
        total = sum(value1, value2);
        System.out.println("The sum of " + value1 + " and " + value2 + " is " + total);
    }
    public static int sum(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }
}
