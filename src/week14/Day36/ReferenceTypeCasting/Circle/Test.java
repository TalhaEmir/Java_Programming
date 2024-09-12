package week14.Day36.ReferenceTypeCasting.Circle;

public class Test {

    public static void main(String[] args) {

        Circle circle1=new Circle(5);
        Circle circle2=new Circle(5);
        Circle circle3=new Circle(15);

        System.out.println(circle1==circle2); // it is compare memory allocations -- gonna be false

        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(circle3));








    }
}