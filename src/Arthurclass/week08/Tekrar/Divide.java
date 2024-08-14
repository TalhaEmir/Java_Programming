package Arthurclass.week08.Tekrar;

public class Divide {

    /*Create a class named DivideTwoNumbers and
write a program that can perform division of two numbers
without using the division (/) and multiplication (*) operators.

		Example:
			n1 = 100
			n2 = 6

		Output:
			16 with a remainder of 4

     */

    public static void main(String[] args) {
        int n1=100;
        int n2=6;
        int quotient=0;

        for(int i=0; n1>=n2; i++){
            n1-=n2;
            quotient++;
        }
        int remainder=n1;
        System.out.println(quotient+ " with a reminder of " + n1);


    }
}
