package Tekrar.Days.DAY17.task;

public class RectngleObject {

    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle();
        rectangle1.width = 13.5;
        rectangle1.height = 7.5;

        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());


        Rectangle rectangle2=new Rectangle();
        rectangle2.width = 8.5;
        rectangle2.height = 6.5;
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());


    }

}
