package Tekrar.Tekrar.Days.Week3day6;

public class booleanIf {
    public static void main(String[] args) {
        int number=20;


        boolean isEven=(number%2==0);
        boolean isOdd= !isEven;


        System.out.println(number + "is an even number:" + isEven);
        System.out.println(number + "is an odd number:" + isOdd);

    }
    /*Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
         Ex:
             number = 20

            output:
                20 is an even number: true
                20 is an odd number: false

        Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)*/





}
