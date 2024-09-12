package Utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int k = 0;

        // arr1 elemanlarını result dizisine kopyalama
        for (int i = 0; i < arr1.length; i++, k++) {
            result[k] = arr1[i];
        }

        // arr2 elemanlarını result dizisine kopyalama
        for (int i = 0; i < arr2.length; i++, k++) {
            result[k] = arr2[i];
        }

        return result;
    }
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = new char[arr1.length + arr2.length];
        int k = 0;

        // arr1 elemanlarını result dizisine kopyalama
        for (int i = 0; i < arr1.length; i++, k++) {
            result[k] = arr1[i];
        }

        // arr2 elemanlarını result dizisine kopyalama
        for (int i = 0; i < arr2.length; i++, k++) {
            result[k] = arr2[i];
        }

        return result;
    }

    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = new double[arr1.length + arr2.length];
        int k = 0;

        // arr1 elemanlarını result dizisine kopyalama
        for (int i = 0; i < arr1.length; i++, k++) {
            result[k] = arr1[i];
        }

        // arr2 elemanlarını result dizisine kopyalama
        for (int i = 0; i < arr2.length; i++, k++) {
            result[k] = arr2[i];
        }

        return result;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = new String[arr1.length + arr2.length];
        int k = 0;

        // arr1 elemanlarını result dizisine kopyalama
        for (int i = 0; i < arr1.length; i++, k++) {
            result[k] = arr1[i];
        }

        // arr2 elemanlarını result dizisine kopyalama
        for (int i = 0; i < arr2.length; i++, k++) {
            result[k] = arr2[i];
        }

        return result;
    }

    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }

    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }

    public static double[] reverse(double[] array) {
        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }

    public static char[] reverse(char[] array) {
        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }

    public static int[] addElement(int[] array, int element) {
        int [] new_array= Arrays.copyOf(array,array.length+1);
        new_array[new_array.length-1]=element;// direk veriyor 6 yi burada
        System.out.println(Arrays.toString(new_array));
        return new_array;
    }


    public static double[] addElement(double[] array, double element) {
        double [] new_array= Arrays.copyOf(array,array.length+1);
        new_array[new_array.length-1]=element;// direk veriyor 6 yi burada
        return new_array;
    }
    public static char[] addElement(char[] array, char element) {
        char [] new_array= Arrays.copyOf(array,array.length+1);
        new_array[new_array.length-1]=element;// direk veriyor 6 yi burada
        return new_array;
    }

    public static String[] addElement(String[] array, String element) {
        String [] new_array= Arrays.copyOf(array,array.length+1);
        new_array[new_array.length-1]=element;// direk veriyor 6 yi burada
        return new_array;
    }
                                    //{1,2,3,4},  1
    public static boolean contains(int[]array, int element){
        for (int each : array) {
            if (each == element) {
                return true;
            }

        }

return false;
    }

    public static boolean contains(double[]array, double element){
        for (double each : array) {
            if (each == element) {
                return true;
            }

        }

        return false;
    }


    public static boolean contains(char[]array, char element){
        for (char each : array) {
            if (each == element) {
                return true;
            }

        }

        return false;
    }



    public static boolean contains(String[]array, String element){
        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }

        }

        return false;
    }

    //array={10,20,30,40};,2====>

   /* public static int[] remove(int[] array, int index) {

    }

    public static int[] removeDuplicates(int[] array) {

    }
*/

}







