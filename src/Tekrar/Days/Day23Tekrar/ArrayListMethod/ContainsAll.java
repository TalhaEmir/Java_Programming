package Tekrar.Days.Day23Tekrar.ArrayListMethod;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsAll {

    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);


        boolean hasList1Has3=list1.containsAll(list3);//true already list no need to Arrays.toSet or
        boolean hasList1tek=list1.containsAll(Arrays.asList(1,2,3));
        System.out.println(hasList1Has3);
        System.out.println(hasList1tek);//true
        boolean hasvada=list1.containsAll(Arrays.asList(1,2,3));

        //if I have gorup of number gonna be Arrays.asList
        //otherwise containsAll is enough




        ArrayList<String>list2=new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
    }
}
