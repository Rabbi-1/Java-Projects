package application2;

import model.Rectangle;
import model.RectangleCon;

public class PassObject2 {
    public static void main(String[] args){
        RectangleCon box = new RectangleCon(12.0, 5.0);
        System.out.println("Contents of the box object:");
        System.out.println("Length : " + box.getLength() +
                "\nWidth : " + box.getWidth());
        changeRectangle(box);
        System.out.println("Now the contents of the box object are: ");
        System.out.println("Length : " + box.getLength() +
                "\nWidth : " + box.getWidth());
    }
    public static void changeRectangle(RectangleCon r){
        r.setLength(0.0);
        r.setWidth(0.1);
    }
}
