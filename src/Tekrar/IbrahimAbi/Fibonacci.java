package Tekrar.IbrahimAbi;

public class Fibonacci {


    public static void main(String[] args) {


            int first=0;
            int second=1;
            int fibonacci=1;
        System.out.println(first);
        System.out.println(second);
        System.out.println(fibonacci);



        for (int i = 2; i <= 9; i++) {
            first= second;
            second= fibonacci;
            fibonacci = first+second;

            System.out.println(i + " " + fibonacci);
        }


        }

    }










