package WEEK13.Day34.Tasks.Car;

public class Honda extends Car {
    public Honda (String model, int year, int price, String color){
    super(model, year,price,color );
}


    public void start() {

        System.out.println(getMake()+ getModel() + " starting");
    }
    public void drive() {

        System.out.println(getMake()+ getModel() + " driving");
    }


}
