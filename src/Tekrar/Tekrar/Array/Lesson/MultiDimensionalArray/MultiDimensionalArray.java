package Tekrar.Tekrar.Array.Lesson.MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        int [][] array2D= new int [3] [];

        //[3] --> number of one dimensional array

        int [] [] arr2D= { {1,2}, {3,4,5},{5,6,7}};

        System.out.println(Arrays.deepToString(arr2D));//[[1, 2], [3, 4, 5], [5, 6, 7], [8, 9, 10, 11]]
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[1][1]);//4

        // first []= index or 1D arrays
        // second []= index of elements

        //arr2D[]= {1,2}
        //arr2D[2][1]=[6]



    }
}
