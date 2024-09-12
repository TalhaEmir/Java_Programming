package Tekrar.Tekrar.Array.Task2;

import java.util.Arrays;

public class aLPHABET {

    public static void main(String[] args) {


      char[]arr1d=new char[26];
      char[]arr2d=new char[26];


      for(int i=0 , j='A', k='Z'; i<arr1d.length; i++, j++, k--){

          arr1d[i]=(char)j;

          arr2d[i]=(char)k;

      }

     System.out.println(Arrays.toString(arr1d));
     System.out.println(Arrays.toString(arr2d));




    }
}
