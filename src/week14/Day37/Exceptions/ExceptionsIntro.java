package week14.Day37.Exceptions;

import week14.Day37.WarmUp.Pizza;

import java.io.FileInputStream;

public class ExceptionsIntro {
    public static void main(String[] args) {

        String str="Java";

       // char ch= str.charAt(250); //unchecked exception/ once we have exception durong the metod exit method get executed
        //Process finished with exit code 1


        //System.out.println(ch);

        Pizza pizza=null;
       // pizza.calcCost();//Process finished with exit code 1//unchecked exception/ but is gonna work // if we didnt hadle it it is gona work



        System.out.println("Hello World");

       // System.out.println(50/0);//unchecked exception/


        int score=100;

        if(score>59){
            System.out.println("Your grade is D");// it is a bug it is not exceptions
        }else if(score>70){
            System.out.println("Your grade is C");// it is a bug it is not exceptions

        }


         System.out.println("===========================");

       // FileInputStream file= new FileInputStream("");// exception checked  unhandled checked exception


        // if we didnt handled when it is checked exceptions code is even one sentence not gonna work everything is messed up


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
