package WEEK13.Day34.WarmUp;

public class Honda extends Car {
    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void start(){
        System.out.println(getMake() + "starting engine very loudly");
    }
}
