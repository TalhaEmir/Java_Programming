package week08.day21.Instruction;

import java.util.Arrays;

public class MultiDimensionForEachLoopReverse {

    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int i = arr2D.length-1; i>=0; i--) {
            int[] arr1D = arr2D[i];// ARR2D indeks numaraasi icerdeki uc elementin
            System.out.println(Arrays.toString(arr1D));
            // sonuc[8, 9, 10, 11, 12]
            //[4, 5, 6, 7]
            //[1, 2, 3]

            for (int j = arr1D.length-1; j>=0; j--) {

                int element= arr1D[j];
                System.out.println(element);
                
            }
            
        }



    }
}
