package Tekrar.Tekrar.Scanner.Tasks;
import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first numner");
        int n1= input.nextInt();

        System.out.println("Enter your math operator");
        char operator= input.next().charAt(0);

        System.out.println("Enter your second number");
        int n2= input.nextInt();

        input.close();

        switch(operator){
            case'+': System.out.println(n1+n2);
            break;
            case'-':System.out.println(n1-n2);
            break;
            case'*':System.out.println(n1*n2);
            break;
            case'/':System.out.println(n1/n2);
            break;
            default:
                System.out.println("invalid operator");


        }




    }

}
