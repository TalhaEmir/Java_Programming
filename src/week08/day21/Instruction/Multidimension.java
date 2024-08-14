package week08.day21.Instruction;

import java.util.Arrays;

public class Multidimension {


    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};        // LOOP FOR MULTIDIMENSION ARRAY arr2d.fori

        for (int i = 0; i < arr2D.length; i++) { //int i = 0; i < arr2D.length; indek numarasi icindeki icinde 3 tane element icin
            int[]arr1d=arr2D[i];// single dimension her biri icin // en kucuge indigimiz icin 2 boyutlidan bir boyuta
            System.out.println(Arrays.toString(arr1d));
            for (int j = 0; j < arr1d.length; j++) {
                int element=arr1d[j];
                System.out.print(element+" ");

            }


        }
//[1, 2, 3]
//[4, 5, 6, 7]
//[8, 9, 10, 11, 12] sonuc

    }
}
