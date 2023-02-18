package model;
import java.text.DecimalFormat;
public class SportCar {
    private CarType make;
    private CarColor color;
    private double price;
    public SportCar (CarType make, CarColor color, double price){
        this.make = make;
        this.color = color;
        this.price = price;
    }
    public CarType getMake(){
        return make;
    }
    public CarColor getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public String toString(){
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        String str = "Make: " + make + "\nColor: " + color + "\nPrice: $" + dollar.format(price);
        return str;
    }
}
