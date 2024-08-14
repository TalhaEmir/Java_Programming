package week08.day19Array.Task;
import java.util.Arrays;

public class Min {


    public static void main(String[] args) {

        int []numbers={100,20,500,40,-10,30};

        int min = numbers[0];// assume that first elemtnt is the min number


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }



        }
        System.out.println(min);
    }
}
