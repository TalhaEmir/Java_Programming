package week07.day17CustomClass.tasks;

public class RectangleClients {

    public static void main(String[] args) {


        Rectangle rectangle1 = new Rectangle();
        rectangle1.width=3.5;
        rectangle1.length=4.5;

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width=5.0;

        System.out.println(rectangle1);
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println(rectangle2);
        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();






    }
}
