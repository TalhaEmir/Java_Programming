package week06.Day14.First1HourTASK;

public class SecondQuestion {


    public static void main(String[] args) {

        System.out.println(sumof2IntegerNumbers(10,20));
        System.out.println(sumof3IntegerNumbers(10,20,30));
        System.out.println(sumof4IntegerNumbers(10,20,30,40));

    }


    public static int sumof2IntegerNumbers(int n1, int n2) {

        return n1 + n2;




    }



    public static int sumof3IntegerNumbers(int n1, int n2, int n3) {

       // return n1 + n2 + n3;
        return sumof2IntegerNumbers(n1, n2) + n3;


    }


    public static int sumof4IntegerNumbers(int n1, int n2, int n3, int n4) {

       //return n1+n2+n3+n4;
        //return sumof3IntegerNumbers(n1,n2,n3) + n4;
        //return sumof2IntegerNumbers(n1, n2) + sumof2IntegerNumbers(n3, n4) ;
        return sumof2IntegerNumbers(sumof3IntegerNumbers(n1, n2, n3),n4);
    }

}
