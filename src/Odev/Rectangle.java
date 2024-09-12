package Odev;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
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

    public void draw(){
        System.out.println("Print rectangle shape");
    }


    public double perimeter(){
        return 2 * length * width;
    }

    public double area(){
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString().trim().replace("}","") +
                    " width " + getWidth() +
                    "length "  + getLength() ;
    }
}
