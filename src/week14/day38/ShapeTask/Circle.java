package week14.day38.ShapeTask;

public class Circle{

    public Circle(double radius) {
        setRadius(radius);
    }

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new InvalidShareException("Radius of circle can not be a zero"+ radius);
        }
        this.radius = radius;
    }
}
