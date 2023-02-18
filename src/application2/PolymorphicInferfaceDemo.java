package application2;
import model.CompactDisc;
import model.DvdMovie;
import model.RetailItem;

import java.text.DecimalFormat;
public class PolymorphicInferfaceDemo {
    public static void main(String[] args){
        CompactDisc cd = new CompactDisc("Idk", "joe", 12.99);
        DvdMovie movie = new DvdMovie("Wheels", 137, 12.95);
        System.out.println("Item #1: " + cd.getTitle());
        showPrice(cd);
        System.out.println("Item #2:" + movie.getTitle());
        showPrice(movie);
    }
    private static void showPrice(RetailItem item){
        DecimalFormat dollar = new DecimalFormat("#,##.00");
        System.out.println("Price: $" + dollar.format(item.getRetailPrice()));
        System.out.println();
    }
}
