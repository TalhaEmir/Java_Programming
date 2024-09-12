package Tekrar.Tekrar.Days.Week3day6;

public class ifclass {

/*Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
         Ex:
             number = 20

            output:
                20 is an even number: true
                20 is an odd number: false

        Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)*/


    public static void main(String[] args) {

        int number=15;
        String result="";


        if (number%2==0){
            result=" is even number";

        } else if (number%2!=0) {
            result=" odd number";

        }
        System.out.println(number+ result );





    }

        }




