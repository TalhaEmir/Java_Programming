package week07.day17CustomClass.tasks.Dikdortgen;

public class Dikdortgen {

    public double width;
    public double length;


    public double calculateArea() {
        double area=width*length;
        System.out.println("Area of rectangle is "+area);
        return area;

        }


    public double perimeterArea(){
        double perimeter=2*width+2*length;
        System.out.println("Perimeter of rectangle is "+perimeter);
        return perimeter;


    }

    public String toString() {
        return "Rectangle2{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
