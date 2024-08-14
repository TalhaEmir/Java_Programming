package week08.day21.Task;

public class Commonelements {
    public static void main(String[] args) {

/*Create a class named CommonElements and write a program that prints out the common elements from two integer arrays.

			Example:
				arr1: {1,2,3,4,5}
				arr2: {4,5,6,7,8}

			Output:
				4
				5

				*/

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8}; //
        // Uzunlukları eşit olan iki dizi
        for (int outerVal : arr1) {
            for (int innerVal : arr2) {
                if (outerVal == innerVal) {
                    System.out.println(outerVal);

                }
            }

        }
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {4, 5, 6, 7, 8};

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }


       /*for (int i = 0, j=0; i < arr1.length; i++, j++) {
            if (arr1[i] == arr2[j]) {
                result =i;
            }else{
                result=0;
            }
        }
        System.out.println(result);*/


            }

        }

    }

}

