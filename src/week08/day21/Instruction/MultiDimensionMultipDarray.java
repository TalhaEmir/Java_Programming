package week08.day21.Instruction;

import java.util.Arrays;

public class MultiDimensionMultipDarray {


    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        //                  1           2       3
        //                  0,1,2   0,1,2,3     0,1,2,3,4,


        for (int[] each1D : arr2D) {
            System.out.println(Arrays.toString(each1D));
            for (int eachElement : each1D) {
                System.out.println(eachElement + " ");
            }

        }




    }
  

    


}
