package week11.Day28.Day28Task.Rectangle;

import java.time.LocalDate;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
      setWidth(width);
       setLength(length);
    }
    private boolean isValid(double num){
        return num > 0;
    }



    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        if(isValid(width)){
            this.width=width;

        }
    }


    public double getLength(){
        return length;
    }


    public void setLength(double length){
        if(length<0){
            System.out.println("Width must be positive");
            System.exit(1);
        }
        this.length=length;
    }


    public double calcArea(){
        return width*length;
    }

    public double calcPerimeter(){
        return 2*(width+length);
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "area" + calcArea() +
                "perimeter" + calcPerimeter() +
                '}';
    }
}
