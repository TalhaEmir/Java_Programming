package week08.day21.Instruction;

public class MultiDimensionalArrayPractice3 {
    public static void main(String[] args) {


   int[][][] arr3D1={  {{1,2},{3,4,5}} ,{{6,7,8,9},{12,13,14}}};
   int[][][] arr3D2={  {{1,2},{3,4,5}} ,{{6,7,8,9},{12,13,14}}};
   int[][][] arr3D3={  {{1,2},{3,4,5}} ,{{6,7,8,9},{12,13,14}}};
   int[][][][]arr4D={arr3D1,arr3D2,arr3D3};// it can be like this


        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElements : each1D) {
                        System.out.println(eachElements+" " );
                    }
                }

            }
            
        }




    }
}