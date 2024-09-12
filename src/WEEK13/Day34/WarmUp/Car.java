package WEEK13.Day34.WarmUp;

abstract class Car { // meet to be inherited, con not be instansiated
    private final String make;
    private final String model;
    private String color;
    private final int year;
    private double price;

    public Car( String model,String color,  int year, double price ){
        this.make=getClass().getSimpleName();
        this.model=model;
        setColor(color);
        if(year<1886){
            System.out.println("year can not be less than 1886" + year );
            System.exit(1);
        }
        this.year=year;
        setPrice(price);
    }

  public final void stop() {// baska subclasslar ulassin ama degistirmesin // t o make sure that non sub classes
System.out.println("Presse the brake" + make + model);
    }

   protected abstract void start();// meant to be overriden // public or protected



    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Price can not be less than negative or zero");
        }
        this.price = price;
    }



    @Override
    public String toString() {
       return make + "{" +
               " model is " + getModel() +
               "color is " + getColor() +
               "year is " + getYear() +
               "price is " + getPrice() +
               "}";

    }
}
