package Tekrar.Tekrar.Days.Day20;

import java.util.Arrays;

public class Day20Mthod {

    public static void main(String[] args) {
        int[]score={0,10,20,30,40,50,60,70,80,90,100};
        System.out.println(Arrays.toString(score));

        //Equals Method=

        int []number1={10,20,30,40,50,60,70,80,90,100};
        System.out.println(Arrays.toString(number1));
        int[]number2={10,20,30,40,50,60,70,80,90,100};
        System.out.println(Arrays.toString(number2));

        System.out.println(Arrays.equals(number1,number2));

        char []ch1={'A','B','C'};
        char []ch2={'A','C','B'};
        System.out.println(Arrays.equals(ch1,ch2));

        int[]nums={100,80,90,75,60,20,40,30, 19,21,0};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Minimum number:" + nums[0]);
        System.out.println("Maximum number:" + nums[nums.length-1]);

        //Copy of

        int[]array={10,20,30,40,50,60,70};//don give negative number length
        int[]array2=Arrays.copyOf(array,10);//give rest of numbers 0

        System.out.println(Arrays.toString(array2));
        int []n1={10,20,30,40,50};
        int []n2={60,70,80,90,100,110,120};

        int[]n3=Arrays.copyOf(n1,n1.length+n2.length);

        System.out.println(Arrays.toString(n3));

        for (int i = 0 , j=n1.length; i < n2.length ; i++, j++) {
            n3[j]=n2[i];

        }
        System.out.println(Arrays.toString(n3));


        //coypofrange

        char[]ch={'A','B','C','D','E','F','G'};

        char[]ada=Arrays.copyOfRange(ch,0,4);// son karakteri almaz
        System.out.println(Arrays.toString(ada));

        // stringi karakter dizisine donusturur charat

        String str="Hello";
        char [] chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));


        // for each loop

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        for (int each : numbers) {
            System.out.println(each);

        }
        System.out.println(Arrays.toString(numbers));//[10, 20, 30, 40, 50, 60, 70, 80, 90]


        String[]names={"Mohammad Karimi","Vasyl Dobrianoski", "Gdir Garimov", "Abidullah Rahimi"};

        for (String each : names) {
            System.out.println(each.charAt(0)+"."+ each.charAt(each.lastIndexOf(" ")+1)) ;

        }
        //  int[][]arr2D=new int[3][]; yani iki tane paragrafin icinde 3 tane kume olacak demek

        int[][] beb2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        System.out.println(beb2D.length);//3
        System.out.println(Arrays.deepToString(beb2D));// [[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]

        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        System.out.println(arr2D.length);//3
        System.out.println(Arrays.deepToString(arr2D));//[[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]



// SPLIT


        String data= "apple,banana,cherry";
        String[] fruits=data.split(",");
        System.out.println(Arrays.toString(fruits));

        for (String each : fruits) {
            System.out.println(each);

        }













    }
}
