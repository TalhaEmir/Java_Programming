package Tekrar.Tekrar.Array.Lesson.MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};


       for (int []each1D:arr2D){
            System.out.println(Arrays.toString(each1D));

            for(int element: each1D){
                System.out.println(element);

            }

        }
    }
}
