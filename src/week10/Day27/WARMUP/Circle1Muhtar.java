package week10.Day27.WARMUP;

public class Circle1Muhtar {

    public Double radius, diameter;
    public static Double pi = 3.14;

    public Circle1Muhtar(){

    }


   // yeni bir object yaratcaksan sadece bir tane yolun var o da asagidaki radius vereceksin
    // diameter sormaya gerek yok cunku zaten radius uzerinden hesaplaniyor
    // bu yuzden vermedik. diameter versek parameter yerine tekrar her seferde vermek zorundayiz.Rdius perimeter icin yeter
    //asagidaki metodu kullnamayiz staticin icinde instance cagiramazsin

    public Circle1Muhtar(double radius) {
        this.radius = radius;
        //this.diameter=perimeter;
        diameter = radius * 2;
    }

      public  double calcArea(){
        return radius* radius* pi;
    }

    /* public static double calcArea(){//
        return radius* radius* pi;
    }*/


   public double calcPerimeter(){
        return 2 * diameter * pi;
   }

   public static void printPiValue(){
        System.out.println(("PI value is: " + pi));
   }


    @Override
    public String toString() {
        return "Circle1Muhtar{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                "calcPerimeter" + calcPerimeter()+
                "calcArea" + calcArea() +
                '}';
    }
}
/*Warmup tasks:
    Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement


*/