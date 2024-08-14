package Tekrar.Tekrar.ArrayList.Lesson;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();

        // we can give index number or element

        list.add("list1");
        list.add("list 2");
        list.add("list 3");
        list.add(2,"Java");

        System.out.println(list);

        list.clear();
        System.out.println(list);//[]
    }
}
