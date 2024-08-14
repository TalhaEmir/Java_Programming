package week03.day05operators;

public class preincrement {

    public static void main(String[] args) {


        /* Unary Plus Operator = indicates positive value
+10==10
10==>10
         */

        /* Unary Minus OPERATOR

        -100==> negative 100
         */

        System.out.println("---------------------------------");

       // Pre increment predecrement there are one step after we put the sign it is change immediately

        int x=100;//increment
        System.out.println(++x); //101
        System.out.println(--x); //100
        System.out.println("---------------------------------");
        int y=100;//predecrement
        System.out.println(--y);
        System.out.println(++y);



       char ch= 95;

        int numb1=50;
        int numb2=200;
        numb2=numb1;
        System.out.println(numb1);
        System.out.println(numb2);




        float a= 100.459_524f;


        System.out.println("5 + 2= " + (3 + 4));
        System.out.println();

        byte b= (byte)a;
        System.out.println(b);
        double c= b;


        System.out.println("Result A" + 0 + 1);
        System.out.println("ResultB" + 1 + 2);
    }
}
