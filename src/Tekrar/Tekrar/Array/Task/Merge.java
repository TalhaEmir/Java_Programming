package Tekrar.Tekrar.Array.Task;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int[] arr2={5,6};
        int[]arr3=new int[arr1.length+arr2.length ];
        int k=0;


        for(int i=0; arr1.length>i ; i++){
            arr3[k]=arr1[i];
            k++;
        }

        for(int i=0 ; arr2.length>i ; i++){
            arr3[k]=arr2[i];
            k++;
        }


        System.out.println(Arrays.toString(arr3));




    }
}
