package Tekrar.Days.Day23Tekrar.ArrayListMethod;
import java.util.ArrayList;
import java.util.Arrays;
public class ArraytoArrayList {

    public static void main(String[] args) {

        String[]array= {"A","B","C","D"};
        ArrayList<String>array1= new ArrayList<>(Arrays.asList(array));
        //Array support everthing and can be multidimensional
        //ArrayList not support primtiive and not multidimensional
        //Array is the best but Arrrays size it fixed
        ArrayList<String>list2=new ArrayList(Arrays.asList("Java","Phyton","C#"));


        //how can we convert Arraylist toArray
        // we can not do directly one of them cilllection ither ARRAY OBJECT different
        //String[]array1=list2;

        String[]array3= array1.toArray(new String[10]);
        //data type should be same and also object it means capital lewtter
        // int[]n=nums.toArray(new Integer[0]); you can not do primitives
        System.out.println(Arrays.toString(array3));






    }
}
