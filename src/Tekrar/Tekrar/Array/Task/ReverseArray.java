package Tekrar.Tekrar.Array.Task;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {


        int [] arr1={1,2,3,4,5};
        int[] arr2=new int [arr1.length];
        int k=0;

        for(int i=arr1.length-1 ; i>=0; i-- ){
            arr2[k]=arr1[i];
            k++;
        }
        System.out.println(Arrays.toString(arr2));
    }



}
