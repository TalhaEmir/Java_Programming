package week14.day38.ThrowKeyword;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {


        System.out.println("Enter your age ");

        int age= new Scanner(System.in).nextInt();
        if(age<0 || age>150 ) {

            if (age < 0) {
                throw new InputMismatchException("Age of the person should not be negative ");

            }else{
                throw new InputMismatchException("Age of the person can not be greater than 150 : " + age);
            }

        }
        //System.err.println("Invalid Age ");
        // System.exit(1);

        if (age >= 21 ) {
            System.out.println("Eligible ");

        }else{
            System.out.println("Not eligible ");
        }


        // new RuntimeException("Runtime exception");
       // System.out.println("Hello World ");
        System.out.println("E=================================================");




// bunu hocaya sor

RuntimeException exception= new RuntimeException("sfwgiw");




        throw new RuntimeException();






       /* try {
            throw new FileNotFoundException("fewfwef");
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        }

*/
    }

   //  throw new Person("Jimmy",45,'M') WE SHOULD USE SOMETHING IS A RELATIONSHIP WITH THROWABLE


    }

