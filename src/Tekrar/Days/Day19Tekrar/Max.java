package Tekrar.Days.Day19Tekrar;

public class Max {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }




    }
}
