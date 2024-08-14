package week11.Day28.Day28Task.BenimCircle;

public class Circle {

    private double radius;



    public Circle(double radius) {

       setRadius(radius);
    }

    public double getRadius(){
        if(radius==0||radius<0){
            System.err.println("Radius can not 0");
            return 0;
        }
        return radius;
    }


    public void setRadius(double radius){
        if(radius>0){
            System.err.println("Radius can not be this value of " + radius);
            return;
        }

    }


    public double calcArea(){

        return Math.PI*radius*radius;
    }

    public double calcPerimeter(){

        return 2*3.14*radius;
    }



    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                "perimeter " + calcPerimeter() +
                "area " + calcArea() +
                '}';
    }
}
