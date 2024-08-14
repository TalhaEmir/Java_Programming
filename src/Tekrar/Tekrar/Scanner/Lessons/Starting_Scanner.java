package Tekrar.Tekrar.Scanner.Lessons;
import java.util.Scanner;
public class Starting_Scanner {

    public static void main(String[] args) {
        //import java.util.Scanner; should be between Package and Class

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a age");
        int age= input.nextInt();
        System.out.println("age = " + age);

        System.out.println("Enter a age");

        double age1=input.nextDouble();

        System.out.println("age = " + age1);



    }
}
