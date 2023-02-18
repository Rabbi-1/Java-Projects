package model;

public class Cube extends Rectangle {
    private double height;
    public Cube(double length, double weight, double height){
        super(length, weight);
        height = this.height;
    }
    public double getHeight(){
        return height;
    }
    public double getSurfaceArea(){
        return getArea() * 6;
    }
    public double getVolume(){
        return getArea() * height;
    }
}
