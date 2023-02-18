package application2;

import model.RectangleCon;

public class ConstructorDemo {
    public static void main (String[] args){
       RectangleCon Box = new RectangleCon(12, 10);
      System.out.println(Box.getLength() + "," + Box.getWidth() + "," + Box.getArea());
    }
}
