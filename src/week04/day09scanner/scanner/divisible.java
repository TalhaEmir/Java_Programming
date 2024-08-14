package week04.day09scanner.scanner;
import java.util.Scanner;
public class divisible {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the number");

       double num = input.nextDouble();
       boolean isEven = (num%2==0);
       boolean isOdd = (num%2 !=1);
       String result="Irrelative";

            if (num % 2 == 0) {
                System.out.println("result is = even");
            } else if (num % 3 == 0) {
                System.out.println("result is = odd");
        }else {
                System.out.println(result);
            }

        input.close();



    }
}