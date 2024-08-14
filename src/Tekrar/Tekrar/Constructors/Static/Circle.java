package Tekrar.Tekrar.Constructors.Static;

public class Circle {
    public double radius;
    public static double pi=3.14;
    public static double ru=4.14;


    static{

    }

    public static void displayPiValue(){
        System.out.println("PI's value is" + pi);
    }

    // objeler siniftan gelir ama static classa aittir
    // instance lari objeler ile cagrilit ama staticler klass ile cagrilir
    //static sadece statik kullanabilir

    //instance hepsini aliyor

}
