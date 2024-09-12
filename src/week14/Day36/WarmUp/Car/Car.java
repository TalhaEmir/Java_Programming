package week14.Day36.WarmUp.Car;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    public int price;
    public String color;

    public Car(String model, int year, int price, String color){
        this.make=getClass().getSimpleName();
        if(getMake() ==null ||getMake().isEmpty()){
            System.out.println("Make can not be null or empty");
            System.exit(1);
        }
        this.model=model;
        if(getModel()==null ||getModel().isEmpty()){
            System.out.println("Model can not be null or empty");
            System.exit(1);
        }
        this.year=year;
        if(getYear()<1886){
            System.out.println("Year can not less than");
            System.exit(1);
        }

        setPrice(price);
       setColor(color);
    }


    public abstract void start();
    public abstract void drive();
    public void stop(){
        System.out.println(getMake()+ getModel() + " car's year can not less than");
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }


    public int getYear(){
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price<1886){
            System.out.println("Price can not less 1886");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color==null ||color.isEmpty()){
            System.out.println("Color can not be null or empty");
            System.exit(1);
        }
        this.color = color;
    }



    public String toString(){
        return make + "{" +
                " model is " + model +
                " year is " + year +
                "price is " + price +
                "color is " + color +
                "}" ;


    }
}
