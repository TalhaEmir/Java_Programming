package Tekrar.Tekrar.Array.Task;

import java.util.Arrays;

public class ReverseAray {

    public static void main(String[] args) {
        int []array = {1,2,3,4,5};

        int [] reverseArray=new int[array.length];



        for(int i=array.length-1, j=0; i>=0 ; i--, j++){

            reverseArray[j]=array[i];



        }

        System.out.println(Arrays.toString(reverseArray));





    }
}
