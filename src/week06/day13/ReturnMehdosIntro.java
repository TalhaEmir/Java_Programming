package week06.day13;

public class ReturnMehdosIntro {


    public static void main(String[] args) {

  // int total= sum(20,40);// sum is a void method, does not return any data

        int total=addition(20,30);
        square(10);
        int t=square(10);
        int r= cube(5);


        System.out.println(t);
        System.out.println(r);
        System.out.println(square(10));
        System.out.println(cube(6));
        System.out.println(total);
        System.out.println(addition(20,30));
    }

/*
    public static void sum(int n1, int n2){

        int result = n1 + n2; // you can not use this method outside the method because it is void
        System.out.println(result);//we can do if it is void

*/

    public static int addition(int n1, int n2) {
        int addition = n1+n2;
       return addition;


    }


public static int square(int num) {

        int square=num*num;

        return square;

    }


    public static int cube(int num) {
        int cube=num*num*num;
        return cube;

    }


    }







