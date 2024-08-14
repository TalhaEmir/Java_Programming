package Week12.Day32.WarmUp;

public class Toyota extends Car {
    public Toyota(String model, String color, int year, double price) {
        super(model, color, year, price);
    }



    public void start(){
        System.out.println("Press the brake at Toyota and twist the key to ignition"+ getMake());
    }




}
