package Tekrar.Tekrar.Array.Task;

import java.util.Arrays;

public class CommonElements {

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};


        for (int i = 0; arr1.length > i; i++) {
            for (int j = 0; arr2.length > j; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr2[j]);
                }
            }
        }
    }
}
