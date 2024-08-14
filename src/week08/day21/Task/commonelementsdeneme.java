package week08.day21.Task;

public class commonelementsdeneme {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4,5,6,7,8}; // Uzunlukları eşit olan iki dizi
        int result = -1; // Başlangıç değeri olarak -1 atanmış

        for (int i = 0, j = 0; i < arr1.length; i++, j++) {
            if (arr1[i] == arr2[j]) {
                result = i;
            }
        }
        System.out.println(result);

    }


        }


