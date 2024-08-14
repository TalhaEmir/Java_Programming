package week10.Day27.WARMUP;

public class CircleTestObject {
    public static void main(String[] args) {

        Circle circle1=new Circle();
        Circle circle2=new Circle(3);
        circle2.diameter=4.10;

        System.out.println(circle2);//Circle{radius=3.0, diameter=4.1, piValue=3.141592653589793perimeter12.88052987971815area28.274333882308138}

        System.out.println(circle2.calcPerimeter());//12.88052987971815

        System.out.println(circle2.calculateArea());//28.274333882308138

        System.out.println( circle2.getPiValue());//3.141592653589793



    }
}
