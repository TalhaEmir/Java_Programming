package Tekrar.Tekrar.Array.Task;

import java.util.Arrays;

public class Reverse2 {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int[] arr2=new int [arr1.length];


        for(int i= arr1.length-1, j=0 ; i>=0; i-- ){
            arr2[j]=arr1[i];
            j++;
        }
        System.out.println(Arrays.toString(arr2));


    }
}
