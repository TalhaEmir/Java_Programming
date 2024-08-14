package week06.Day14.tasks;

public class LiteralTask {

    public static void main(String[] args) {
/*Create a method named square that takes an int and returns the square, hierarchically calling the
	calculate method to calculate the square.*/

        System.out.println(square(5));
        System.out.println(cube(5));



    }


    public static int square(int a) {
       int squareMethod= a*a;
       return squareMethod;
    }
    public static double square1(double b) {
        double squareMethod1= b*b;
        System.out.println(squareMethod1);
        return squareMethod1;
    }

    public static int cube(int a) {
        int cubeMethod = a * square(a);
        return cubeMethod;
    }


}