package week08.day19Array.Task;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers  do you want to enter number: ");
        int total = input.nextInt();
        int sum=0;

        int[]numbers=new int[total];
        for (int i = 0; i < total; i++) {
            System.out.println("Enter a Number");
            numbers[i]= input.nextInt();// buradaki tum degerleri numbersi nin icindeki elementlere esitliyor
            sum += numbers[i];
        }


        double average = sum/(double)total;

        DecimalFormat df = new DecimalFormat("0.00");


        System.out.println(Arrays.toString(numbers));
        System.out.println("sum = " + sum);
        System.out.println("The average number is: " + df.format(average));


    }
}
