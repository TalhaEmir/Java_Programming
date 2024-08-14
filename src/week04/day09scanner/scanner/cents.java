package week04.day09scanner.scanner;
import java.util.Scanner;

public class cents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Cents");
        int cents = input.nextInt();
        input.close();

        int dollars = cents / 100;
        cents -= dollars * 100;

        System.out.println(dollars+ " dollars and " + cents + " cents");



    }
}