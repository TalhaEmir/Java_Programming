package groupworkstrainin.Scanner;
import java.util.Scanner;

public class problem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number: ");
        int num = input.nextInt();

        if (num>0 ) {


            if (num % 2 == 0) {
            System.out.println(num + " is even");
            }else {
            System.out.println(num + " is odd");
            }



        }else {
            System.out.println(num + " is not valid");
        }



    }

    /*Tasks:
    1. Odd or Even number
            1.1 Ask the user to enter a number
            1.2 determine if the number is odd or even

    2. Eligible or not Eligible to buy alcohol
            2.1 Ask the user to enter his/her age
            2.2 write a program that can check if the person eligible to buy alcohol

    3. MonthName
            3.1 Ask the user to enter a number
            3.2 Display the month name*/



}
