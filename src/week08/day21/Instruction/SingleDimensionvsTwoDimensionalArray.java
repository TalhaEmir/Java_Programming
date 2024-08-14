package week08.day21.Instruction;

import java.util.Arrays;

public class SingleDimensionvsTwoDimensionalArray {


    public static void main(String[] args) {

        int[]arr1D=new int[10];
        System.out.println(Arrays.toString(arr1D));
        //                  first bracket[] numbers of 1 dimensional Array // second [] brackets whic elements



        int[]arr1={1,2,3,4,5};
        int[]arr2= {6,7,8};
        int[]arr3={9,10};
        int[]arr4={11,12,13,14,15};
        int[]arr5={16,17,18,19,20,21};


        arr1D[0]=100;//arr1d nin icindeki 0.ci element 100

        int [][] arr2D=new int[5][];//index 0-4// bes tek boyutlu seri
        arr2D[0]=arr1D;//first index zero for array// not elements just first dimensipnal array +
        //arr2D[0] = arr1D; // arr2D: [[0, 0, 0, 0, 0, 0, 0, 0, 0, 0], null, null, null, null]
        //arr2D[0] = arr1D; ifadesi, arr1D dizisini arr2D'nin ilk satırına atar.


        System.out.println(Arrays.deepToString(arr2D));//[[0, 0, 0, 0, 0, 0, 0, 0, 0, 0], null, null, null, null]
        //arr2D[0]=100; should be single dimension array gave a compiler
        arr2D[0]=arr1;
        arr2D[1]=arr2;
        arr2D[2]=arr3;
        arr2D[3]=arr4;
        arr2D[4]=arr5;

        System.out.println(Arrays.deepToString(arr2D));//[[1, 2, 3, 4, 5], [6, 7, 8], [9, 10], [11, 12, 13, 14, 15], [16, 17, 18, 19, 20, 21]]


    }
}
