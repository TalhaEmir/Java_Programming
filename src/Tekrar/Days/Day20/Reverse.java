package Tekrar.Days.Day20;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

            /*3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};*/


        int[] array={1,2,3,4,5};
        int[]reverse=new int[array.length];

        for (int i = array.length-1 ,j=0; 0 <=i; i--,j++ ) {
            reverse[j]=array[i];
        }
        System.out.println(Arrays.toString(reverse));

    }

}
