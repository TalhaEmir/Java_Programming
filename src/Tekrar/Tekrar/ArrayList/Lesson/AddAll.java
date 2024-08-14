package Tekrar.Tekrar.ArrayList.Lesson;

import java.util.ArrayList;
import java.util.Arrays;

public class AddAll {

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

        list2.add("li1");
        list2.add("li");
        list2.add("list1");
        list2.add("l");
        list2.add("li3");
        list2.add(2,"Ja");
        System.out.println(list2);


        System.out.println(list2.addAll(list)); // or
        System.out.println(list2.addAll(1,list)); // after first index
        System.out.println("=================================="); // a
        System.out.println(list2.addAll(Arrays.asList("lia","olur" )));
        System.out.println(list2.addAll(1,Arrays.asList("lia","lista" ))); // after first index
        System.out.println(list2);



    }
}
