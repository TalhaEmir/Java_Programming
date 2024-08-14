package Arthurclass.week08;

public class divide {
    public static void main(String[] args) {

/*Create a class named DivideTwoNumbers and
write a program that can perform division of two numbers
without using the division (/) and multiplication (*) operators.

		Example:
			n1 = 100
			n2 = 6

		Output:
			16 with a remainder of 4*/

          //first solution   int i=100;

/*
       int quotient=0;

        for (int i=100 ; i >=6 ; i-=6) {

            quotient +=1;
        }
        System.out.println("quetiont is " + quotient);
        System.out.println("remainder =" + i);
*/


        int divident=100;
        int divisor=6;
        int quotient=0;


        for (int i=0; divident>= divisor; i++){
            divident -= divisor;
            quotient++;

        }
        int remainder= divident;

        System.out.println(quotient+ " with a reminder " + remainder);


    }
}
