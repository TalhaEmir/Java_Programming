package Tekrar.Tekrar.Array.Lesson.MultiDimensionalArray;

import java.util.Arrays;

public class InstantiatingMultiDimensionalArray {

    public static void main(String[] args) {


        int [] [] arr2D= { {1,2}, {3,4,5},{5,6,7}, {8,9,10,11}};

        System.out.println(Arrays.deepToString(arr2D));//[[1, 2], [3, 4, 5], [5, 6, 7], [8, 9, 10, 11]]

        System.out.println(Arrays.toString(arr2D[1]));//[3, 4, 5]

        System.out.println(Arrays.toString(arr2D[0]));//[1, 2]



    }
}
