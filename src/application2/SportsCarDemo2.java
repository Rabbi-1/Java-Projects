package application2;

import model.CarColor;
import model.CarType;
import model.SportCar;

public class SportsCarDemo2 {
    public static void main(String[] args){
        SportCar yourNewCar = new SportCar(CarType.FARRARI, CarColor.BLACK, 13133);
        switch(yourNewCar.getMake()){
            case PORSCHE:
                System.out.println("your car was made in Germany.");
                break;
            case FARRARI:
                System.out.println("Your car was made in Italy.");
                break;
            default:
                System.out.println("I'm not sure where that car was made");
        }
    }
}
