package week10.Day27.LONG;

public class Car {//Outer class


    public String make,model,color;
    public int year;
    public double price;
    public static int wheels=4;

    // if you want to use below class you should create new Car Objectt
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

    public static class StaticInnerClass{// static only accepts static variable just static member of class
public void method(){
    //System.out.println(make);
}

    }

}
