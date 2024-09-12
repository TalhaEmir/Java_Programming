package Odev;

public class Cube extends Shape  implements Volume{
    private double side;

    public Cube(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double area() {
        return 6*side*side;
    }

    public double perimeter() {

        return 12*side;
    }
    public void draw() {

        System.out.println("Drawing Cube");
    }

    public double volume(){
        return side * side * side;
    }



    public String toString() {
        return super.toString().trim().replace("}","") +
                "side "+ getSide()+
                "}";
    }

}
