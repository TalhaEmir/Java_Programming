package week04.day09scanner.scanner;
import java.util.Scanner;

public class charscannernext {

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);
        System.out.println("Would you like to continue");
        String answer = input.next();


        System.out.println("You have entered " + answer );
    }
    }
