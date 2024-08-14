package Tekrar.Tekrar.Array.Lesson.MultiDimensionalArray;

import java.util.Arrays;

public class LoopingMultiDimensionalArray {

    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        //                  0          1        2


        for(int i= 0 ; i < arr2D.length ; i++){
            int [] arr1D= arr2D[i];
            System.out.println(Arrays.toString(arr1D));//[1, 2, 3][4, 5, 6, 7][8, 9, 10, 11, 12]
        for(int j=0 ; j< arr1D.length ; j++){
             int element= arr1D[j];
            System.out.println(element+ "\t");
        }
        }
    }
}
