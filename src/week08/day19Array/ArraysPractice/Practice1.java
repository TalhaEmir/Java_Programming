package week08.day19Array.ArraysPractice;

import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args) {



    int[] arr1=new int [100];




       /* for (int i =0 , j=10 ;i<arr1.length; i++, j+=10) {  // i = indeks number j= ona dispatchelegimiz degerler


        }
        System.out.print("Arr1 = "+ Arrays.toString(arr1));*/


        for (int i =0 , j=10 ;i<arr1.length; i++){

            arr1[i]=i+1;

        }

        System.out.println("arr1 = " + Arrays.toString(arr1));


        int[] arr2=new int [100];

        for (int i = arr2.length - 1;  i >= 0; i--) {
            arr2[i]= 100-i;

        }

        System.out.println("arr2 = " + Arrays.toString(arr2));




}
}