package week14.Day36.WarmUp.Car;

public class Tesla extends Car implements AutoPark, AutoPilot {
    public Tesla(String model, int year, int price, String color){
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

}

