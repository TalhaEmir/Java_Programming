package Tekrar.Tekrar.ArrayList.Lesson;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsAll {
    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>();

        // we can give index number or element

        list.add("list1");
        list.add("list1");
        list.add("list1");
        list.add("list 2");
        list.add("list 3");
        list.add(2,"Java");


        System.out.println(list);
        ArrayList<String> list2= new ArrayList<>();

        // we can give index number or element

        list2.add("list1");
        list2.add("list1");
        list2.add("list1");
        list2.add("list 2");
        list2.add("list 3");
        list2.add(2,"Java");
        System.out.println(list2);

// both of side should be ArrayList it means both of them should be Collection, order is not important , if there is one wrong complteley wrong


        System.out.println(list2.containsAll(list));//true or

        System.out.println(  list2.containsAll(Arrays.asList("list1", "list 2")));//true


    }
}
