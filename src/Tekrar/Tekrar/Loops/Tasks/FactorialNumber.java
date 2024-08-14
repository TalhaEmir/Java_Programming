package Tekrar.Tekrar.Loops.Tasks;

public class FactorialNumber {

    /*
     Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
*/
    public static void main(String[] args) {
        int num=10;

        int factorial=1;

        while (num > 1) {

            factorial *= num--; // factorial = factorial * num
            System.out.println(factorial);
        }
        System.out.println(factorial);


    }
}
