package Tekrar.Tekrar.Array.Lesson.SingleDimensionArray;

import java.util.Arrays;

public class CopyofRange {
    public static void main(String[] args) {
        int [] numbers={10,20,30,40,50,60};

        int []number=Arrays.copyOfRange(numbers,0,3);

        System.out.println(Arrays.toString(number));//[10, 20, 30, 40] always like last index minus 1

        //or

        int []numbero=Arrays.copyOfRange(numbers,0,3+1);

        System.out.println(Arrays.toString(numbero));//[10, 20, 30, 40]


    }
}
