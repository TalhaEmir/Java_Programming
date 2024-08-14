package Tekrar.Tekrar.ArrayList.Lesson;

import java.util.ArrayList;

public class SizeMethod {

    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();

        list.add("list1");
        list.add("list 2");
        list.add("list 3");
        list.add(2,"Java");


        list.size();

        int total=list.size();

        System.out.println(total);//4

    }
}
