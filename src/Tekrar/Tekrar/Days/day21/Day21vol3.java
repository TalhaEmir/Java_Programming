package Tekrar.Tekrar.Days.day21;

import java.util.Arrays;

public class Day21vol3 {

    public static void main(String[] args) {

        int[][]arr2D1 = {{1,2}, {3,4,5}};
        int[][] arr2D2 = {{6,7,8,9}, {10,11,12,13,14}};
        int[][] arr2D3 = {{7,8,9}};

        int[][][]arr3D1={ {{1,2},{3,4,5}},{{6,7,8,9},{10,11,12,13,14}},{{15,16,17,18}}};

        System.out.println(Arrays.deepToString(arr3D1));//[[[1, 2], [3, 4, 5]], [[6, 7, 8, 9], [10, 11, 12, 13, 14]], [[15, 16, 17, 18]]]
        System.out.println(Arrays.toString(arr3D1[1][0]));//[6, 7, 8, 9]
        System.out.println(arr3D1[1][1][2]);//12
        System.out.println("================================");
        for (int i = 0; i < arr3D1.length; i++) {
           int [][] newGroup= arr3D1[i];
            System.out.println(Arrays.deepToString(newGroup));
            for (int j = 0; j < newGroup.length; j++) {
                int[]newSquad=newGroup[j];
                for (int k = 0; k < newSquad.length; k++) {
                    int element=newSquad[k];
                    System.out.println(element);

                }


            }


        }
        int[][][] arr3D0={  {{1,2},{3,4,5}} ,{{6,7,8,9},{12,13,14}}};
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


    }
}
