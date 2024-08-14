package Tekrar.Tekrar.Array.Task;

import java.util.Arrays;

public class Multiply {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        for (int i = 0; number.length > i; i++) {
            if (number[i] % 2 == 1) {
                number[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(number));
    }




}