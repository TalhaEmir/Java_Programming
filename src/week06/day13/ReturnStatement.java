package week06.day13;

import java.util.jar.JarOutputStream;

public class ReturnStatement {


    public static void main(String[] args) {
        int result=multiply(5,10);
        eligible(25);

        System.out.println("==============================");
        System.out.println("Test Started");
        boolean exit= true;

        if(exit){
            return;// main method gets terminated

        }

        System.out.println("Test1 completed");
        System.out.println("Test2 started");
    }


    public static void eligible(int age){
        if(age<0||age>=150){
            System.out.println("invalid age" + age);
            return;// exits the method// also you can not put any value in this method in here next to return
            // if the age is invalid, then  this gets terminated
        }
        if(age>21){
            System.out.println("You are eligible to buy alcgohol" );
        }else{
            System.out.println("You are not eligible to buy alcgohol");
        }
    }


    public static int multiply(int a, int b){
        int result=a*b;
        return result;// return the value when exiting the method
    }

}
