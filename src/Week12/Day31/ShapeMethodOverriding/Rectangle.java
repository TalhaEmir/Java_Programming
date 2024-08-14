package Week12.Day31.ShapeMethodOverriding;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(){
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double area(){
    return width* length;
    }

    public double perimeter(){
        return 2*width*length;
    }

    public void draw(){
        System.out.println("Drawing a " + getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name "+ getName()+
                "length=" + length +
                ", width=" + width +
                "perimeter" + perimeter()+
                " area" + area() +
                '}';
    }
}
