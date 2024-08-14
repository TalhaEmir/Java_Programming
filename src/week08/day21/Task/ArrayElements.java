package week08.day21.Task;

import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {
        /*. Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
*/

//nums[i-1]-> converts the whcih is the number to a index

        int[] nums=new int [100];// numi direk esitlersem sifirdan baslayamayiz numin sifirdan baslamasi lazim
        // assiggn values from 1 to 100 to the indexes of the array
        for (int i = 1; i <= 100; i++) {// olay indeksin uzunluktan bir eksik olmasi // diziyi doldurduk sonra yazdirdik
            nums[i-1]=i;// numin ici 0 oldugunda yani numin o indeksi 1 nums1 1 olamaz indeks sifrdan basliyor
            // bizim indeksi sifirdan baslatmamiz lazim num[0] hep boyle baslamalai
            /*i = 1 olduğunda:
i - 1 = 0
nums[0] = 1 (dizinin 0. indeksine 1 atanır)
i = 2 olduğunda:
i - 1 = 1
nums[1] = 2 (dizinin 1. indeksine 2 atanır)
...
i = 100 olduğunda:
i - 1 = 99
nums[99] = 100 (dizinin 99. indeksine 100 atanır)*/
            //numin 0.endeksi 1 numin 1.endeksi 2 numin 2.endeksi
        }

        //display the array elements in a single line sperated by spaces
        for (int i = 0; i < nums.length; i++) {//num 99=100
            System.out.print(nums[i]+ " ");// numi yazdirmak arrayi yazdirir ama ben parantezsiz istiyorum

        }
        System.out.println("==================");

        for (int i = nums.length-1; i >=0; i--){
            System.out.print(nums[i]+ " ");//cunku sifirda da yazdiriyor yuz oluyor
        }
        System.out.println("==================");

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] %5 ==0){
                System.out.println( nums[i] + " ");
            }
            }
        }

    }

