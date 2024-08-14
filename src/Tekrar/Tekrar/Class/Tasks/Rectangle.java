package Tekrar.Tekrar.Class.Tasks;

public class Rectangle {

    public double width;
    public double length;


    public double calculateArea(){
        return width*length;

    }

    public double perimeter(){
        return 2 * (width +length);
    }



    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "perimeter" + perimeter() +
                "calculateArea" + calculateArea() +
                '}';
    }
}
