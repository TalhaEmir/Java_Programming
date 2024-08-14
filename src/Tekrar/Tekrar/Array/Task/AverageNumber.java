package Tekrar.Tekrar.Array.Task;
import java.util.Arrays;
import java.util.Scanner;
public class AverageNumber {

    public static void main(String[] args) {
/*
        Scanner input= new Scanner(System.in);
        System.out.println("Enter how many number you want");
        int number=input.nextInt();

        while (number > 0) {

            System.out.println("Enter your number");
            int nums=input.nextInt();
            number--;

        }

        int [] totalNumber=new int[number];


        for(int i=0; totalNumber.length>i ; i++){
            totalNumber[i]=nums;
        }
*/
        Scanner input= new Scanner(System.in);

        System.out.println("Enter how many number you want");
        int total=input.nextInt();

        int[] numbers = new int[total];

        int sum=0;

        for(int i=0 ; total>i ; i++){
            System.out.println("Enter your number");
            numbers[i]=input.nextInt();
            sum+=numbers[i];
        }

        double average= (double)sum/ total;
        System.out.println("Numbers: "+ Arrays.toString(numbers));




    }
}
