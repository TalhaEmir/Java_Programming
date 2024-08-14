package week09.day23.ArraysLists;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraytoArrayList {

    public static void main(String[] args) {
        String[]array= {"A","B","C","D"};
        ArrayList<String> list= new ArrayList(Arrays.asList(array));

        //Array support everuthing and can be multidimensional
        //ArrayList not support primtiive and not multidimensional
        //Array is the best but Arrrays size it fixed


        ArrayList<String>list2=new ArrayList(Arrays.asList("Java","Phyton","C#"));
        //how can we convert Arraylist toArray
        // we can not do directly one of them colllection ither ARRAY OBJECT different
        //String[]array1=list2;

        String[] languages=list2.toArray(new String[10]);// Array gonna have size of 10
        // if this three elements at inside Array gonna be zero rest of these
        System.out.println(Arrays.toString(languages));//[Java, Phyton, C#, null, null, null, null, null, null, null]

        ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(1,2,3,4,7,8));

        //data type should be same and also object it means capital lewtter
        Integer[]n=nums.toArray(new Integer[0]);
        // int[]n=nums.toArray(new Integer[0]); you can not do primitives
        System.out.println(Arrays.toString(n));//[1, 2, 3, 4, 7, 8]














    }
}
