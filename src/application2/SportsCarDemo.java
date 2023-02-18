package application2;
import model.CarColor;
import model.CarType;
import model.SportCar;

public class SportsCarDemo {
    public static void main (String[] args){
        SportCar yourNewCar = new SportCar(CarType.PORSCHE, CarColor.RED, 10000);
        System.out.println(yourNewCar);

    }
}
