package model;

public class Telephone {
    public static String format(String number){
        StringBuilder str = new StringBuilder(number);
        str.insert(0, '(');
        str.insert(4, ')');
        str.insert(8, '-');
        return str.toString();
    }
}
