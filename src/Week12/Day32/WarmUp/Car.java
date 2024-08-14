package Week12.Day32.WarmUp;

public class Car {

    private String make;
    private String model;
    private String color;
    private int year;
    private double price;
   public static int numberOfWheels;
  public static boolean hasBattery;

    static{
        numberOfWheels=4;
        hasBattery=true;
    }

    public Car(String model, String color, int year, double price) {
     setMake(getClass().getSimpleName());
      setModel(model);
      setColor(color);
       setYear(year);
        setPrice(price);
    }

        public void start(){
        System.out.println("Press the brake and twist the key to ignition" + make + model);
        }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<=0){
            System.out.println("Year can not be zero or negative" + year);
           System.exit(1);
        }

        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if(price<=0){
            System.out.println("Price can not be below zero" + price);
            System.exit(1);
        }
        this.price = price;
    }



    @Override
    public String toString() {
        return  make+ "{"+
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                "numberOfWheels" + numberOfWheels +
                "hasBattery" + hasBattery +
                '}';
    }
}
