package week06.day13;

import com.sun.source.tree.BreakTree;

public class Returnmethodpractises {

    public static void main(String[] args) {

        System.out.println(isOdd(2));
        System.out.println(isOdd(1));
        int num = 200;
        if (isEven(num)) {// another solution
            System.out.println(num + "is even number");
        } else {
            System.out.println(num + "is odd number");
        }

        max(10,2);
        System.out.println(max(10,2));
        int value= max(10,2);
        System.out.println(value);



    }


    public static boolean isOdd(int number) {
        //return (number % 2 != 0) ? true : false;
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int number) {
        //return !isOdd(number);
        return (number % 2 == 0) ? true : false;
    }

    public static int max(int n1, int n2) {

        // ternary return n1>n2?n1:n2;
        if (n1 > n2) {
            return n1;
        } else {
            return n2;

        }


    }

}