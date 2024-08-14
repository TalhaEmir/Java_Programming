package week04.day09scanner.scanner;

import java.util.Scanner;

public class nextlinevsnext {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);// Enter


        System.out.println("Enter your age: ");
        int age=input.nextInt(); //45\n+Enter

        input.nextLine();

        System.out.println("Enter your full name: ");
        String full_Name=input.nextLine();

        System.out.println("age= " + age);
        System.out.println("full_name =" + full_Name);



    }


    }
