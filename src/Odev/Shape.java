package Odev;

public abstract class Shape {

    private String name;


    public Shape(){
    }

    public Shape(String name){
        setName(name);
    }


    public void setName( String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

   public abstract double area();
    public abstract double perimeter();
    public abstract void draw();

    public String toString(){
        return getClass().getSimpleName() + "{" +
                " area " + area() +
                " perimeter " + perimeter()+ "}"
                        ;


    }


}
