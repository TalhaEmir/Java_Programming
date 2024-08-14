package Tekrar.Tekrar.Array.Lesson.SingleDimensionArray;

import java.util.Arrays;

public class toEqual {

    public static void main(String[] args) {
        char[]arr1={'a','d','c','e'};
        char[]arr2={'a','d','c','e'};


        boolean result=Arrays.equals(arr1,arr2);
        System.out.println(result);//true
    }
}
