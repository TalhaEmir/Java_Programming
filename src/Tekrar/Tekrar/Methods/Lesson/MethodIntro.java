package Tekrar.Tekrar.Methods.Lesson;

public class MethodIntro {

    public static void main(String[] args) {


        System.out.println("Test Started");


String st1="Java";

System.out.println(st1);

            displayMessage();

    }



    public static void displayMessage(){
            System.out.println("Hello Everyone");
        System.out.println("I love Java");

    }

    public static void displayMessage(int num){
        System.out.println("Hello Everyone");
        System.out.println("I love Java");
        System.out.println("I love Java" + num);

    }
}
