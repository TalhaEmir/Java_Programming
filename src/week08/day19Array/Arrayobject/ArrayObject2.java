package week08.day19Array.Arrayobject;
import java.util.Arrays;
public class ArrayObject2 {

    public static void main(String[] args) {

        int[] arr1={10,20,30,40,50};
        int[] arr2=arr1;
        int[] arr3=arr2;



        arr1[0]=1000;
        arr2[2]=3000;
        // if you have one array object you can attach multiple variables

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


        System.out.println("===============");

        String[] a1={"Umran", "Mehmet"};
        a1=new String[]{"James", "Daniel"};

        System.out.println(Arrays.toString(a1));

    }
}
