package Week12.Day31.WarmUp;

public class Bike extends Vehicle {
    public Bike(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void ride(){
        System.out.println(getBrand()+getModel() + getYear() + "is cycling at California" );
    }

    }

