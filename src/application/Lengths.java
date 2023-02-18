package application;

public class Lengths {
    public static void main (String[] args){
        int [][] number = {{12,14,15,15,15},
                {1231,131,131,13,123},
                {123131,1231,1231,123}};
        System.out.println("The number of rows is " + number.length);
        for(int index = 0; index < number.length; index++){
            System.out.println("The number of columns in row " + (index + 1) + " is " + number[index].length);
        }
    }
}
