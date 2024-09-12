package WEEK13.day35.WarmUp;

public abstract class Car extends Transportation {
    public Car(String make,String model, String color, int year,double price) {
        super(make, model, color, year, price);
    }


    public void transportPeople() {
        System.out.println(getMake() + getModel() + " transporting people");
    }
    public void start() {

        System.out.println(getMake() + getModel() + " vehicle is starting");
    }

    public void drive(){
        System.out.println(getMake() + getModel() + " driving");

    }




}
