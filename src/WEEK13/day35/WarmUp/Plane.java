package WEEK13.day35.WarmUp;

public abstract class Plane extends Transportation implements Flyable {
    public Plane(String make,String model, String color, int year,double price){
        super(make, model, color, year, price);
    }


    public void transportPeople() {
        System.out.println(getMake() + getModel() + " transporting people");
    }
    public void start() {

        System.out.println(getMake() + getModel() + " vehicle is starting");
    }

    public void land() {

        System.out.println(getMake() + getModel() + " is landing");
    }

    public void flying() {
        System.out.println(getMake() + getModel() + " vehicle is flying");
    }

}
