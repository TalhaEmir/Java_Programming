package week10.Day26.Constructors;

public class Iphone {

   public static String brand="Apple"; // static: "Apple" is the brand of all iphone objects
    public String model;// instance; different models for iphone objects
    public String color;// instance; different colors for iphone objects
    public int price;// instance; different price for iphone objects
    public static String OS="IOS";// static; same OS for iphone objects
    public static String madeIn="CHINA"; // static; same madeIn for iphone objects
    public static boolean hasBattery=true;// static
    public static boolean isTouchScreen=true;//static



    /*
       Attributes:
       brand,model,colour,price,OS,madeIn,hasBattery,isTouchScreen`
     */

    public void printPhoneInfo(){// it is object and instance methods acepts both static and none static
        // instance methods can share what the class has it means we can use statics variable class members

        System.out.println("Brand" + brand);
        System.out.println("Model" + model);
        System.out.println("Colour" + color);
        System.out.println("price" + price);

    }

    public static void printOperatingSystem(){// we can not use instance variable
        // if we want
        // you dont need object
        //static should be with static
        System.out.println("Operating System:"+ OS);
    }

    public Iphone(String model, String color,int price) {
        this.model = model;
        this.price = price;
        this.color = color;

    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    /*
    public static void printPhoneInfo(){// class member , can class share the what object has, it can not. Because object came from class,

        System.out.println("Model" + model);
        System.out.println("Color" + color);

*/




    }

