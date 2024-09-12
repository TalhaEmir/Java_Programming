package Tekrar.Tekrar.Array.Task2;

import java.util.Arrays;

public class OneHundred {

    public static void main(String[] args) {


        int [] array1=new int[100];

        for(int i=1; i<=array1.length; i++){
            array1[i-1]=i;
        }



        for(int i=0; i<array1.length; i++){
            System.out.print(array1[i]+"\t");
        }




    }
}
