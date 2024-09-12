package Tekrar.Tekrar.ArrayList.Lesson;

import java.util.ArrayList;

public class IndexOfLastIndexOf {
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
        list.indexOf("Phyton");
        System.out.println(  list.indexOf("Phyton"));//-1
        System.out.println(  list.indexOf("list1"));//0
        System.out.println(  list.lastIndexOf("list1"));//3





    }
}
