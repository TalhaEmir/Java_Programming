package WEEK13.Day34.WarmUp;

public class Tesla extends Car{
    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }


    public void start(){
        System.out.println(getMake() + "starting engine without gas");
    }

    public void autPilot(){
        System.out.println(getMake() + "driving car by itself without driver");
    }
}


