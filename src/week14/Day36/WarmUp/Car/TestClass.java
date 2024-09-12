package week14.Day36.WarmUp.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
        CydeoCark muhtar= new CydeoCark("Model",2015,35000,"Red");
        muhtar.fly();
        System.out.println(muhtar);

        MERCEDES gl5= new MERCEDES("BATCH36",1999,35000,"RED");
        System.out.println(gl5);

        Car[] cars = {
                new Honda("Pilot", 2010, 25000, "White"),
                new AUDI("Q6", 2014, 32000, "Red"),
                new Honda("Accord", 2011, 20000, "White"),
                new AUDI("Q4", 2015, 33000, "Blue"),
                new AUDI("A7", 2019, 35000, "Black"),
                new AUDI("Q8", 2018, 40000, "White"),
                new AUDI("Q5", 2009, 30000, "Purple"),
                new AUDI("A4", 2011, 30000, "Black"),
                new Honda("Civic", 2018, 30000, "Red"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V", 2019, 35000, "Blue"),
                new Tesla("Model 3", 2015, 45000, "White"),
                new Tesla("Model Y", 2017, 65000, "Black"),
                new Tesla("Model X", 2016, 48000, "White"),
                new Tesla("Model X", 2014, 48000, "Blue")
        };


        int higherPrice=-2000;
        int lowestPrice=1000000000;



        for(Car each: cars){

            if((each instanceof Honda) && (each.getYear()<2012 && each.getYear()>2009) ){
                System.err.println("These years 2010 and 2011 models" + each.getMake()+ each.getYear() + " is eligible to recall");
            }else if((each instanceof AUDI) && (each.getYear()<2019 && each.getYear()>2016)){
                System.err.println("These years 2010 and 2011 models" + each.getMake()+ each.getYear() + " is eligible to recall");

        }else {
                if((each instanceof Tesla) && (each.getYear()<2017 && each.getYear()>2014)){
                    System.err.println("These years 2010 and 2011 models" + each.getMake()+ each.getYear() + " is eligible to recall");


                }
            }

            }

        for(Car each: cars){
            if(each.getPrice()> higherPrice ){
                higherPrice= each.getPrice();
            }
            if(each.getPrice()<lowestPrice){
                lowestPrice=each.getPrice();
            }
        }


        System.out.println("higher price is " + higherPrice + " lowest price is" + lowestPrice);


        ArrayList<Tesla>teslaCars= new ArrayList<>();

        for(Car each: cars){
            if(each instanceof Tesla){
                teslaCars.add((Tesla) each );
            }
        }


        System.out.println(Arrays.asList(teslaCars));

    }
}
