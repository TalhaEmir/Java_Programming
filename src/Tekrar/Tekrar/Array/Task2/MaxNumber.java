package Tekrar.Tekrar.Array.Task2;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {

        int []array1={1,2,3,4,56,4,3,4,56,654,3,2,34,4};

        int max=array1[0];

        for(int i=0; array1.length>i; i++){
            if(array1[i]>max ){
                max= array1[i];
            }
        }


        System.out.println(max);


        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};


        int max2=arr2D[0][0];


        for(int i=0; arr2D.length>i; i++){
           int arr1D[]=arr2D[i];
           for(int j= 0 ; arr1D.length> j ; j++){
               int element= arr1D[j];
               if(element> max2){
                   max2=element;
               }
            }
        }

        System.out.println(max2);


        int[][] arr2DD = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        int max3=arr2D[0][0];


        for(int []arr1d: arr2DD){
            System.out.println( Arrays.toString(arr1d));
            for(int element: arr1d){
                System.out.println( element);
                if(element> max3){
                    max3=element ;
                }

            }
        }

        System.out.println(max3);



    }
}