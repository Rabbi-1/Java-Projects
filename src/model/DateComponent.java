package model;
import java.util.StringTokenizer;
public class DateComponent {
    private String day;
    private String month;
    private String year;
    public DateComponent(String dateStr) {
        StringTokenizer strTokenizer = new StringTokenizer(dateStr, "/");
        int count = 0;
        while (strTokenizer.hasMoreTokens()) {
            switch (count) {
                case 0:
                    month = strTokenizer.nextToken();
                    break;
                case 1:
                    day = strTokenizer.nextToken();
                    break;
                case 2:
                    year = strTokenizer.nextToken();
                    break;
            }
            count++;
        }
    }
    public String getMonth(){
        return month;
    }
    public String getDay(){
        return day;
    }
    public String getYear(){
        return year;
    }
}
