package WEEK13.Day34.Tasks.Car;

public class CydeoCark extends Car implements AutoPark, Flyable1{
    public CydeoCark (String model, int year, int price, String color){
        super(model, year,price,color );
    }




    public void start() {

        System.out.println(getMake()+ getModel() + " starting");
    }
    public void drive() {

        System.out.println(getMake()+ getModel() + " driving");
    }
    public void autoPark() {
        System.out.println(getMake()+ getModel() + " is otomaticly parking");
    }

    public void selfDrive() {
        System.out.println(getMake()+ getModel() + " is selfdriving");
    }
    public void fly() {
        System.out.println(getMake()+ getModel() + " is flying");

    }


}
