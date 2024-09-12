package Odev;

public class Square extends Shape{

 private double side;
    public Square(double side) {
       setSide(side);
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void draw(){
        System.out.println("Print square shape");
    }


    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side* 4;
    }

    @Override
    public String toString() {
        return super.toString().trim().replace("}","") +
                "side "+ getSide()+
                "}";
    }
}
