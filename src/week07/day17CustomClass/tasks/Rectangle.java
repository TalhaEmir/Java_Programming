package week07.day17CustomClass.tasks;

import com.sun.security.jgss.GSSUtil;

public class Rectangle {

    public double width;
    public double length;

    public void calculateArea() {
        double area=width*length;
        System.out.println("Area of rectangle is "+area);

    }

    public void calculatePerimeter() {
        double perimeter=2*(width+length);
        System.out.println("Perimeter of rectangle is "+perimeter);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}

