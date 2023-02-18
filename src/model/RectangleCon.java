package model;

public class RectangleCon {
    private double length;
    private double width;

    public RectangleCon (double len, double w){
        length = len;
        width = w;

    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return length * width;
    }
    public void setLength(double len){
        length = len;
    }
    public void setWidth(double w){
        width = w;
    }

}
