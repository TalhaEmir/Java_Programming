package Tekrar.Tekrar.Class.Tasks;

public class RectangleObject {

    public static void main(String[] args) {

        Rectangle rectangle1= new Rectangle();
        rectangle1.width=10.5;
        rectangle1.length= 11.5;

        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.perimeter());

    }
}
