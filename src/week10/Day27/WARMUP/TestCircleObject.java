package week10.Day27.WARMUP;

public class TestCircleObject {

    public static void main(String[] args) {

        Circle1Muhtar circle1=new Circle1Muhtar(3.5);
        Circle1Muhtar circle2=new Circle1Muhtar(5);
        Circle1Muhtar circle3=new Circle1Muhtar(7);


        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println(Circle1Muhtar.pi);// you should call through the class
        //System.out.println(circle2.pi);//wrong call
        //System.out.println(circle3.pi);
        //System.out.println(Circle1Muhtar.radius);// you should call through the class NOT LIKE THIS



    }



}
