package Tekrar.Tekrar.Scanner.Tasks;
import java.util.Scanner;

public class Dolar {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your cents");
        int cent= input.nextInt();
        input.close();

        int dolar= cent/100;
        int remainder= cent-(dolar *100);
        System.out.println(cent + " equal to " + dolar + "dollars" + remainder + "cents");
        /*
3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225
                output:
                225  cents equal to: 2 dollars and 25 cents
 */

    }






}
