package application2;

import model.Rectangle;
import model.RectangleCon;

public class PassObject {
    public static void main(String[] args){
        RectangleCon box = new RectangleCon(12.0, 5.0);
        displayRectangle(box);
    }
    public static void displayRectangle(RectangleCon r){
        System.out.println("Length : " + r.getLength());
        System.out.println("Width : " + r.getWidth());
    }
}
