package Tekrar.Tekrar.ArrayList.Tasks;

import java.util.Arrays;

public class MaMin {


    public static void main(String[] args) {
        int[][]  array = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};


        int max = array[0][0];
        int min = array[0][0];
        for (int i = 0; i <  array.length; i++) {
            int[] arr1D =  array[i];
            System.out.println(Arrays.toString(arr1D));//[1, 2, 3][4, 5, 6, 7][8, 9, 10, 11, 12]
            for (int j = 0; j < arr1D.length; j++) {
                int element = arr1D[j];


                if (element > max) {
                   max = element;
                }
                if (element < min) {
                    min = element;
                }


            }

        }


    }


}