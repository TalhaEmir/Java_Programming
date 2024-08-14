package Week12.Day31.ShapeMethodOverriding;

public class Test {
    public static void main(String[] args) {
        Square square1=new Square();
        System.out.println(square1);//Shape{name='Square'area= '25.0'perimeter= '20.0'name='Square'}
        square1.draw();
        System.out.println("==================================");

        Circle circle=new Circle();
        System.out.println(circle);

       Rectangle rectangle=new Rectangle();
       System.out.println(rectangle);





    }







}
