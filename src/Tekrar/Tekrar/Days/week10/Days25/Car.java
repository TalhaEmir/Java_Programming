package Tekrar.Tekrar.Days.week10.Days25;

public class Car {//Outer class


    public String make,model,color;
    public int year;
    public double price;
    public static int wheels=4;

    public void drive() {

    }


    public class carEngine {// Inner Class
        // we can use any static or instance member of class

        public void method(){
            System.out.println(make);
            System.out.println(wheels);

        }

        //only inner class can be static
        //any other class can not be static

    }
    // if the inner class is static class

}

