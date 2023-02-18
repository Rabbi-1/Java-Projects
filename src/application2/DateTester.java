package application2;

import model.DateComponent;

public class DateTester {
    public static void main(String[] args){
        String date = "10/23/2009";
        DateComponent dc = new DateComponent(date);
        System.out.println("Month: " + dc.getMonth() +
                "\nDay: " + dc.getDay() +
                "\nYear: " + dc.getYear());
    }
}
