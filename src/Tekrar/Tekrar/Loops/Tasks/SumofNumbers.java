package Tekrar.Tekrar.Loops.Tasks;

public class SumofNumbers {

    public static void main(String[] args) {
        /* Create a class named SumOfNumbers and write a program to calculate the sum of all numbers between 1 and any given number.

				Example 1:
					   number = 100

				Output:
					  5050


				Example 2:
					    number = 50

				Output:
					  1275
*/

        int Num=100;
        int sumOfNum=0;

        for(int i= 1 ;  i<=Num ; i++ ){
            sumOfNum +=i;
        }

        System.out.println(sumOfNum);
    }
}
