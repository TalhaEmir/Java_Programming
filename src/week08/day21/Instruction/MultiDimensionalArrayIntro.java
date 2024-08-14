package week08.day21.Instruction;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[] ar1 = {10, 20, 30};
        int[] ar2 = {40, 50, 60, 70, 80};
        int[] arr3 = {90, 100};
        int[] arr4 = {100, 200, 300};


        //int[][]arr2D=new int[3][];

        //int[][]arr2D={1,2,3,4,5}; it is not container for element container for multidimensional array
        System.out.println("===================");
        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}, arr4};// it contains 3 single dimensions of arrays variable
        System.out.println(arr2D.length);//3

        int[][] array2D = {{10, 20, 30}, {40, 50, 60, 70}, {80, 90, 100, 110, 120}};

        System.out.println(array2D.length);

        System.out.println(Arrays.toString(array2D[1]));// 2nin birinci indeksindeki arrayi yazdircak
        System.out.println(Arrays.toString(array2D[2]));
        System.out.println(Arrays.toString(array2D[0]));

        System.out.println(array2D[2][1]);//90
        System.out.println(array2D[1][2]);//60

        for (int i = 0; i < array2D.length; i++) { // 'i <= array2D.length' yerine 'i < array2D.length' olmalı.
            int[] each1D = array2D[i];
            System.out.println(Arrays.toString(each1D));

            for (int j = 0; j < each1D.length; j++) {// j index number of elements in each 1D array of array2d
                int eachElement = each1D[j];
            }


        }

        System.out.println("============================");


        for (int[] each1DArray : array2D) {
            System.out.println(Arrays.toString(each1DArray));
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);

            }

        }

        System.out.println("============================");

        for (int i = array2D.length - 1; i >= 0; i--) {//each single dimensipn of arrays
            for (int j = array2D.length - 1; j >= 0; j--) {//index number of each element for one dimentional array
                System.out.println(array2D[i][j]); // i= index number of single dimention array // j= index number of elements
            }

        }
        System.out.println("============================");

        for (int[] each1DArray : array2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);

            }


        }

    }

}