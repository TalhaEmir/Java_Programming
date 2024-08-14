package week07.day16;

import java.util.Scanner;

public class DoWhileLoopLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String u,p;

        int attempt=3;


        do {
            System.out.println("Enter your username: ");
            u=input.nextLine();
            System.out.println("Enter your password: ");
            p=input.nextLine();
            attempt--;

            if (attempt==0) {
                break;
            }
        }while ( !(u.equals("Cydeo")&& p.equals("WoodenSpoon")) );// while the credentials are invalid
    }
}
