package week03.day05operators;

public class postincrement {


    public static void main(String[] args) {

// There are two steps at the post. If we apply increment
// it didn't change everyrthing at the same time.
//postincrement
       int a= 50;
        System.out.println(a++);
        System.out.println(a);


        System.out.println("-------------");
// postdecrement

        int b= 48;
        System.out.println(b--);
        System.out.println(b);
        System.out.println("-------------");


        int n= 30;
        int m=n++;
        System.out.println(m);
        System.out.println(n);


        int z= 60;
        int q= z--;
        System.out.println(q);
        System.out.println(z);





    }

}
