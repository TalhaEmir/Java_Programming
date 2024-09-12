package Tekrar.Tekrar.Days.DAY17.task;

public class Rectangle {

    public double width;
    public double height;



    public double calculateArea() {
        double area = width * height;
       return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * width * height;
        return perimeter;
    }


    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "perimeter=" + calculatePerimeter() +
                ", area=" + calculateArea() +
                '}';
    }
}
