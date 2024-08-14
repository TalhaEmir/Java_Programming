package Tekrar.Tekrar.Scanner.Lessons;
import java.util.Scanner;

public class NextVsNextLine {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age");//10

        int age=input.nextInt();


        input.nextLine();// should be put

        System.out.println("Enter your full name");
        String fullName=input.nextLine();

        System.out.println("Enter your age" + age);
        System.out.println("Enter your full name"+ fullName);



    }
}
