package Tekrar.Tekrar.Array.Lesson.SingleDimensionArray;

import java.util.Arrays;

public class InstantiatingArray {
    public static void main(String[] args) {

        int [] numbers;
        numbers=new int[5];// defaukt value if int 0 it means there are 5 zero inside the this number array

        System.out.println(Arrays.toString(numbers));//[0, 0, 0, 0, 0]


        numbers[1]=20;
        //numbers[6]=70;// wrong our maximum number 5, index out of exception

        System.out.println(Arrays.toString(numbers));// for one dimensional array you have to use toString method
//[0, 20, 0, 0, 0]


        // getting number directly from index

        System.out.println(numbers[1]);//20

    }
}
