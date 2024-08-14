package week10.Day25.Constructors;

public class Rectangle {

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //before constructor
public static void main(String[] args) {

}


public double length, width;

/*public void setInfo(double length, double width){

    this.length=length;
    this.width=width;*/



public double area(){

    return length*width;
}



    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "area= " + area() +
                '}';
    }
}
