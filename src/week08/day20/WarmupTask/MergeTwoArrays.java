package week08.day20.WarmupTask;

import java.util.Arrays;
import week10.Day27.Utilities.ArraysUtility;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7};
        int[] array3 = new int[array1.length + array2.length]; // array3'ün boyutunu belirler

        int k = 0; // array3'ün indeks numarası

        // array1'in elemanlarını array3'e kopyalama
        for (int i = 0; i < array1.length; i++, k++) {
            array3[k] = array1[i];
        }

        // array2'nin elemanlarını array3'e kopyalama
        for (int i = 0; i < array2.length; i++, k++) {
            array3[k] = array2[i];
        }

        // array3'ü yazdırma
        System.out.println(Arrays.toString(array3));

        System.out.println("===================");

        int[] a1 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] a2 = {100, 120, 130};

        int[] a3 = ArraysUtility.merge(a1, a2);

        System.out.println(Arrays.toString(a3));
        System.out.println("===================");

        double[]b1={10.5,5.5,3.5,6.5,8.5};
        double []b2={20.5,15.5,13.5};
        double[]b3= ArraysUtility.merge(b1,b2);

        System.out.println("===================");
        char[]ch1={'A','b', 'c', 'd'};
        char[]ch2={'X','Y', 'Z'};

        char[] ch3= ArraysUtility.merge(ch1,ch2);//merge is method is calling from arrays utility
        System.out.println(Arrays.toString(ch3));

        System.out.println("===================");

        String[] c1 = {"java", "Phyton", "JavaScript", "Ruby"};
        String[] c2 = {"C2", "C++", "swift"};

        String []c3=ArraysUtility.merge(c1, c2);
        System.out.println(Arrays.toString(c3));


    }









}
