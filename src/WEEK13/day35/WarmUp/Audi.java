package WEEK13.day35.WarmUp;

public class Audi extends Car implements AutoPark {
    public Audi(String make, String model, String color, int year,double price){
        super(make, model, color, year, price);
    }
    public void autoPark() {
        System.out.println(getMake() + getModel() + " has a ability to park itself");
    }





}
