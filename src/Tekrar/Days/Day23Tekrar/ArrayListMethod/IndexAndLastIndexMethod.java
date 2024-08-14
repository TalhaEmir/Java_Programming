package Tekrar.Days.Day23Tekrar.ArrayListMethod;

import java.util.ArrayList;
public class IndexAndLastIndexMethod {
    public static void main(String[] args) {


        System.out.println("==========index of and lastindex of METHODS ===============");

        ArrayList<Integer>num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);

        //index of and lastindex of
        //should be String or character you can not put directly number
        //always element from right to the left
        // it is return number of element

        num.lastIndexOf(1);
        num.lastIndexOf(2);

        num.indexOf(1);
        System.out.println(num.indexOf(1));//0
        num.lastIndexOf(3);

        System.out.println(num.lastIndexOf(1));//0
        System.out.println(num.lastIndexOf(2));//1
        System.out.println(num.lastIndexOf(3));//2

         /*System.out.println(list.indexOf("Phyton"));
        int index1=namesit.indexOf("Phyton");
        System.out.println(index1);//2
        int index2=namesit.lastIndexOf("Java");
        System.out.println(index2);//3*/

        ArrayList<String>list=new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        list.indexOf("1");

        list.indexOf("2");

        list.indexOf("3");


        System.out.println(list.indexOf("1"));//0



    }
}
