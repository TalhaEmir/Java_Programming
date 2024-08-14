package Tekrar.Tekrar.Loops.Lesson;
import java.util.Scanner;
public class WhileLoop {

    public static void main(String[] args) {

        int number = 0;

        while (number <= 5) {

            System.out.println("Hello");

            number++;

        }


        Scanner input = new Scanner(System.in);
        int num = 0;

        while (num >= 0) {// negative 1
            System.out.println("Enter a number");
            num = input.nextInt();
        }


    }

}