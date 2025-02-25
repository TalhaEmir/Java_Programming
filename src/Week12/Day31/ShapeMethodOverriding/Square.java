package Week12.Day31.ShapeMethodOverriding;

public final class Square extends Shape {
    private double side;

    public Square(){

    }

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t* * * * * *");
        for (int i = 0; i < 4; i++) {
            System.out.println("\t*         *");
        }
        System.out.println("\t* * * * * *");
    }

    @Override
    public String toString() {
            return getClass().getSimpleName() + "{" +
                    "name='" + getName() + '\'' +
                    ", side='" + side + '\'' +
                    "area= '" + area() + '\'' +
                    "perimeter= '" + perimeter() + '\'' +
                    '}';
        }
}
