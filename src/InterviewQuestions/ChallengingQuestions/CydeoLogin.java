package InterviewQuestions.ChallengingQuestions;

import java.util.Scanner;

public class CydeoLogin {  public static void main(String[] args) {

    String username = "Cydeo";
    String passWord = "WoodenSpoon";

    Scanner input = new Scanner(System.in);
    System.out.println("Enter user name");
    String u1 = input.next();

    System.out.println("Enter password ");
    String p1 = input.next();

    if (username.equals(u1) && passWord.equals(p1)) {
        System.out.println("Logged in.");
    } else {
        int attempt = 0;
        while ((!username.equals(u1) && !passWord.equals(p1)) && attempt < 2) {
            System.out.println("incorrect username or password please reenter");
            System.out.println("Enter user name");
            u1 = input.next();
            System.out.println("Enter password ");
            p1 = input.next();
            attempt++;

        }
        System.out.println("your account locked please contuct with support");
    }


}

}
/*




 */



