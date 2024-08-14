package week08.day19Array.Arrayobject;

import java.util.Arrays;

public class ArrayObject {

    public static void main(String[] args) {

        int[]numbers;
        numbers= new int[5]; // maximum number 4 . you can not change this number its size gonna be 5. there must be 5 elements
       //int[] numbers= new int[5] // if there is number 5 index number gonna be 4 it start from 0 to 4 but item gonna be 5
        //index numbers always start from 0

        numbers [1]=20;// if we want to index number 0 or 1 we gonna put this bracket it is call element that at the index 0 or 1
        numbers[4]=30;


        System.out.println(Arrays.toString(numbers));// if we want to call value of arrays we have to tostring

        System.out.println(numbers[1]);
    }
}
