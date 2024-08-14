package Week12.Day32.WarmUp;

public class BMW extends Car{
    public BMW(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void start(){
        super.start();
        System.out.println("Call the mechanic or jump start " + getMake());
    }
}
