package week08.day20.WarmupTask;
import week10.Day27.Utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {


        /*3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};*/


        int[] array={1,2,3,4,5};

        int[] reverse=new int[array.length];// 5 4 3 2 1



        for(int i=array.length-1, j=0; i>=0 ;i--){
            reverse[j++]=array[i];
        }

        System.out.println(Arrays.toString(reverse));




        System.out.println("===================");




        int[]nums={100,200,300,400,500};
        nums=ArraysUtility.reverse(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("===================");

        double[]a1={1.5,2.5,3.5};
        double[]a2=ArraysUtility.reverse(a1);
        System.out.println(Arrays.toString(a2));







    }
}
