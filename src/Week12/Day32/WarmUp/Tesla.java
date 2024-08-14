package Week12.Day32.WarmUp;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car {
    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void start() {
        System.out.println("Say, Start" + getMake());
    }

    public void autoPilot() {
        System.out.println(getMake()+ " has a autoPilot");
    }

    @Override
    public void setModel(String model) {
        String [] models= {"Model S", "Model Y", "Model x", "Model 3"};

        if(!Arrays.asList(models).contains(model)){// if specified model is not valid
            System.err.println("Invalid Tesla Model" + model);
        }
        super.setModel(model);
    }

    @Override
    public void setColor(String color) {
       ArrayList<String> colors= new ArrayList<>();
       colors.addAll(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green"));

        if(!colors.contains(color)){// if specified model is not valid--> boylre yapmasiinin sebebi
            // contains metodunun Array Listte olmasi bu yuzden collectiona cevirdi
            System.err.println("Invalid Tesla color" + colors);
        }
        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        if(year<2008){
            System.err.println("Invalid Year" + year);
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {

        if(price<50000) {
            System.err.println("Invalid price" + price);
            System.exit(1);
        }
        super.setPrice(price);
    }
}