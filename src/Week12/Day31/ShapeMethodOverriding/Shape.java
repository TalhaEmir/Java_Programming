package Week12.Day31.ShapeMethodOverriding;

public class Shape {
    private String name;


    public Shape() {
        setName(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public void draw(){
System.out.println("Drawing a " + getClass().getSimpleName());
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                "area= '" + area() + '\'' +
                "perimeter= '" + perimeter() + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
