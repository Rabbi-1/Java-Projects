package application;

public class EnumDemo {
    enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
    public static void main (String[] args){
        Day workDay = Day.WEDNESDAY;
        System.out.println(workDay);
        System.out.println(Day.WEDNESDAY);
        System.out.println("value for " + Day.SATURDAY + " is " + Day.SATURDAY.ordinal());
        System.out.println("value for " + Day.SUNDAY + " is " + Day.SUNDAY.ordinal());
        if(Day.FRIDAY.compareTo(Day.THURSDAY) > 0)
            System.out.println(Day.FRIDAY + " is greater than " + Day.THURSDAY);
        else
            System.out.println(Day.THURSDAY + " is not greater than " + Day.THURSDAY);
    }
}
