package Week12.Day31.WarmUp;

public class Car extends Vehicle {
    public Car(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void drive(){
        System.out.println(getBrand()+getModel() + getYear() + "is moving at California" );
    }

}
