package Odev;

public class Circle extends Shape{

    private final double pi=3.14;
    private double radius;


    public Circle(double radius) {
      setRadius(radius);
    }





    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getPi(){
        return pi;
    }

    public double area(){
        return radius* pi*radius;
    }

    public double perimeter(){
        return 2* pi*radius;
    }


    public void draw(){
        System.out.println("Print circle shape");
    }

    @Override
    public String toString() {
        return super.toString().trim().replace("}","")+
                " radius " + getRadius() +
                " pi " + getPi() + "}";
    }
}
