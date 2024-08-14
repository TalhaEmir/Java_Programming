package week10.Day27.WARMUP;

public class Circle {

    public double radius;
    public double diameter;
    public static final double PI_VALUE = Math.PI;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }



    public Circle(double radius,double diameter ) {
        this.diameter = diameter;
        this.radius = radius;
        getPiValue();
        calculateArea();
        calcPerimeter();
    }

    public double calculateArea() {
        double area =  PI_VALUE * radius * radius;
        return area;
    }

    public double calcPerimeter() {
        double perimeter =  PI_VALUE * diameter;
       return perimeter;

    }


    public double getPiValue(){
        return PI_VALUE;
    }

    public String toString() {
        return "Circle{" +
                " radius= " + radius +
                ", diameter= " + diameter +
                ", piValue= " + PI_VALUE +
                " perimeter= " + calcPerimeter()+
                " area= " + calculateArea()+
                '}';
    }
}