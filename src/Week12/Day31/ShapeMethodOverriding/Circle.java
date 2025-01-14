package Week12.Day31.ShapeMethodOverriding;

public final class Circle extends Shape {

    private double radius;


    public Circle() {

    }


    public Circle(double radius) {
       setRadius(radius);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    @Override
    public double area() {
        return radius* radius * 3.14;
    }

    @Override
    public double perimeter() {
        return 6.28*radius;
    }

    @Override
    public void draw() {
        super.draw();
        //code fragments can draw a circle
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                "radius='" +radius + '\'' +
                "area= '" + area() + '\'' +
                "perimeter= '" + perimeter() + '\'' +
                '}';
    }
}
