package week04.day09scanner.scanner;
import java.util.Scanner;

public class NextlineMethodPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String full_Name = input.nextLine();//Aaron King Daniel + Enter
        System.out.println("Enter your school Name");//Cydeo School + Enter
        String school_Name = input.nextLine();
        System.out.println("Enter your gender= ");// Male+Enter
        String gender = input.next();

        System.out.println("Enter your age= ");
        int age = input.nextInt(); //28 + Enter

        input.nextLine(); // Clear out the scanner// we have to give extra nextline() method If we are using a nextLine() method after the other methods of scanner


        System.out.println("Enter your street name= ");
        String street_name = input.nextLine();





    }

}
