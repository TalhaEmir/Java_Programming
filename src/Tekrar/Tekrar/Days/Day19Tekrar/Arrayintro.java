package Tekrar.Tekrar.Days.Day19Tekrar;
import java.util.Arrays;

public class Arrayintro {

    public static void main(String[] args) {

        int[] scores = new int[5];// index 0-4 first index always 0

        scores[0] = 85;
        scores[2] = 78;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 95;




        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);

        }

        System.out.println("=========================");


        System.out.println(scores[scores.length-1]);
        System.out.println("=========================");


        //int[] numbers= new int[5];// its only for you dont know what is the for elements are // five zero right now
        // int[]numbers={10,20,30,40,50};// array object I created size is


        int[] numbers= new int[5];// its only for you dont know what is the for elements are // five zero right now
        int[]num={10,20,30,40,50};// array object I created size is fixed. We can not change size of the Array

        int[] nums={10,20,30,40,50};

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers =" + Arrays.toString(numbers));
        System.out.println("nums =" + Arrays.toString(nums));

        System.out.println("===========================");
        //element 1     2   3               4           5       6           7
        String []days= {"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //              index1      2              3           4           5       6           7





    }


}