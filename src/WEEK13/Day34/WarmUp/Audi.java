package WEEK13.Day34.WarmUp;

public class Audi extends Car{
    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }


    public void start(){
        System.out.println(getMake() + "starting engine very quick");
    }

    public void autoPark(){
        System.out.println(getMake() + "parking car by itself without driver");
    }
}
