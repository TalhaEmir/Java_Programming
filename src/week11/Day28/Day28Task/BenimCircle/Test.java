package week11.Day28.Day28Task.BenimCircle;

public class Test {
    public static void main(String[] args) {
        Circle circle1=new Circle(2.14);

        System.out.println(circle1);//Circle{radius= 0.0perimeter 0.0area 0.0}

        circle1.setRadius(3.14);

        System.out.println(circle1.getRadius());

        System.out.println("===========================");


        Circle circle2=new Circle(2.14);

        System.out.println( circle2.calcPerimeter());//13.439200000000001

        System.out.println( circle2.calcArea());//14.379944000000002

        System.out.println("===========================");

        Circle circle3=new Circle(2.15);

        circle3.setRadius(0);//Radius can not be this value of 0.0

       System.out.println(circle3.getRadius());//Radius can not 0



        Circle circle4=new Circle(0);


    }
}
