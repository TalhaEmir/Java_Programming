package Tekrar.Tekrar.Days.day21;

import java.util.Arrays;

public class DAY21 {

    public static void main(String[] args) {

        //int[][]arr2D=new int[3][]; //yani iki tane paragrafin icinde 3 tane kume olacak demek
        //first int -[] =[] indexes of 1d arrays ==== ikinci [] =indexes of elements
        //int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        // bunda          index= 0  index= 1  index= 2

        int [][] arr2D={{1,2},{3,4},{5,6}};
       arr2D[1][1]=100;
       System.out.println(Arrays.deepToString(arr2D));
        // int[][]arr2D=new int[3][10];
        //3 satır ve 10 sütun içeren bir dizi oluşturur ve başlangıçta tüm değerleri 0'dır.
        //   arr2D[1][1]=100;  dizisinde belirli bir indeksteki değeri 100 olarak ayarlar.



        int[]numbers={1,2,3,4,5,6,7,8,9,10};
        int element=100;

       int[] newNumbers=Arrays.copyOf(numbers,numbers.length+1);
       newNumbers[newNumbers.length-1]=element;
       System.out.println(Arrays.toString(newNumbers));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100]


        System.out.println(numbers.length);//10

        int[][]arr2D1={{1,2} ,{3,4}};
        System.out.println(Arrays.deepToString(arr2D1));// BOYLE YAZILACAK
        System.out.println(arr2D1[1][1]);//4





    }
}
