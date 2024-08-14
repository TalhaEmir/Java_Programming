package Tekrar.Days.Day20;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {


        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7};
        int[] array3 = new int[array1.length+ array2.length];

        int k=0;

        for(int i=0;i<array1.length;i++ , k++){
            array3[k]=array1[i];
        }

        for(int i=0;i<array2.length;i++ , k++){
            array3[k]=array2[i];
        }

        System.out.println(Arrays.toString(array3));

    }
}
