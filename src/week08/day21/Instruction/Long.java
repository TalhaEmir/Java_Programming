package week08.day21.Instruction;

import java.util.Arrays;

public class Long {

    public static void main(String[] args) {


        //  int[][]arr2D=new int[3][]; yani iki tane paragrafin icinde 3 tane kume olacak demek
            //first int -[] =[] indexes of 1d arrays ==== ikinci [] =indexes of elemetns
        //                  0 1 2   0 1 2 3   0 1 2   3  4
        //int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        // bunda          index= 0  index= 1  index= 2


       // int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
       // System.out.println(arr2D.length);//3
      //[[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]

       // int[][]arr2D=new int[3][10];
        //it is contains 3 1 dimensional arrays

        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
            // FIRST BRACKET ELEMENTS OF ITEM , SECOND BRACKET INDEX OF ITEMS INSIDE THE ELEMENT
        System.out.println(arr2D.length);
        System.out.println(Arrays.deepToString(arr2D));//[[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]



        //ACCESSING
        System.out.println(Arrays.toString(arr2D[1]));//[4, 5, 6, 7]
        System.out.println(Arrays.toString(arr2D[0]));//[1, 2, 3]
        System.out.println(arr2D[1][2]);//6


            // LOOP FOR MULTIDIMENSION ARRAY arr2d.fori

for (int i = 0; i < arr2D.length; i++) { //int i = 0; i < arr2D.length; indek numarasi icindeki icinde 3 tane element icin
          int[]arr1D=arr2D[i];// single dimension her biri icin // en kucuge indigimiz icin 2 boyutlidan bir boyuta
          System.out.println(Arrays.toString(arr1D));
    for (int j = 0; j < arr1D.length; j++) {
        //System.out.println(arr1D[j]);
        int element=arr1D[j];
        System.out.println(element);

    }


       }
//[1, 2, 3]
//[4, 5, 6, 7]
//[8, 9, 10, 11, 12] sonuc


    }
}


