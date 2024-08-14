package week09.DAY22;
import java.util.Arrays;
import java.util.ArrayList;
public class ArrayListIntro1 {

    public static void main(String[] args) {

        int[]array=new int[5];// size five{0,0,0,0,0}
        //minimum element size 5 max element size 5

        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        //array[5]=60;
        System.out.println(Arrays.toString(array));//[10, 20, 0, 0, 0]


        System.out.println("=========================================");

        //wrapperclassi Arraylistin icinde kullaniyoruz
        //<Integer> normalde integer olmamali veya int ama biz wrapper koyduk Integer

       // ArrayList<Integer> list=new ArrayList<Integer>();

        //but give it empty that side
        // ArrayList<char> list=new ArrayList<Integer>();-->wrong

        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.println(list);//[]--> list=icindeki elemanlari soyluyor
        System.out.println(list.size());// size-->lengh soyluyor



    }
}
