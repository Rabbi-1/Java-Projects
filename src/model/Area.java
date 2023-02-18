package model;

public class Area {
    public static double getArea(double radius){
        return Math.PI * radius * radius;
    }
    public static double getArea(int l, int w){
        return l * w;
    }
    public static double getArea(double radius, double height){
        return Math.PI * radius * radius * height;
    }
}
