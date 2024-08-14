package Tekrar.Tekrar.ArrayList.Lesson;

import java.util.ArrayList;

public class EqualsMethod {

    public static void main(String[] args) {
        //contain same elements or same design pattern

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


        System.out.println(list==list2);//false--> memory allocation
        System.out.println(list.equals(list2));// //contain same elements and same order--true
    }
}
