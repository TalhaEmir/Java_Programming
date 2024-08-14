package week09.DAY22;
import java.lang.Double;
public class WrappingClassIntro {

    public static void main(String[] args) {

        String str="Java";

        int a=10;    //primitive// if want to use that one I have to add  Integer a2=10; // Wrapper Class Integer
        Integer a2=10; // Wrapper Class Integer//

        System.out.println("==================");

        int b1= 100;//primitive
        Integer b2=b1;// when we assigning to the primitive to the integer is "autoboxing"
        double c1=b1;
        long c2=b1;
        //Long b3=b1; //because it is not integer it is long should be the right one
        //Long b3= wrapper class object
        //but
        Long b3=(long)b1;

        //Double b4=b1; its wrong

        //but

        char ch='A';
        Character ch2=ch; //autoboxing


        double d1=5.5;
        Double d2=d1;//autoboxing


        Integer n1=20;
        int n2=n1;// unboxing
        long n3=n1;
        double n4=n1; // because primitive casting its bigger than int


        Character e1='Z';
        char e2=e1;// unboxing
        int e3=e1;
        long e4=e1;






    }


}
