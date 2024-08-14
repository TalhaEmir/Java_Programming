package week08.day20.WarmupTask;
import java.util.Arrays;

public class Multiply {


    public static void main(String[] args) {


        /*1. write a program that can multiply each odd number of an integer array by 2
		            ex:
		            	array = [1,2,3,4,5];
*/
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
//numbers[i]= how can I get the element from numbers

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0) {
                continue;
            }
            numbers[i] = numbers[i] * 2;
        }

        System.out.println(Arrays.toString(numbers));












    }
}

