package Week12.Day32.WarmUp;

public class Honda extends Car{
    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void start(){
        System.out.println("Press the brake at and twist the key to ignition" + getMake());
    }

}

