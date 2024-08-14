package Tekrar.Tekrar.ArrayList.Lesson;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>();

        // we can give index number or element

        list.add("list1");
        list.add("list1");
        list.add("list1");
        list.add("list 2");
        list.add("list 3");
        list.add(2,"Java");


       boolean isContainsList1= list.contains("list1");
        System.out.println(isContainsList1);//true
    }
}
