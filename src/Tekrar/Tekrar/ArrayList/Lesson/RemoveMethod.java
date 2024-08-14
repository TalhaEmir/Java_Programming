package Tekrar.Tekrar.ArrayList.Lesson;

import java.util.ArrayList;

public class RemoveMethod {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();

        // we can give index number or element

        list.add("list1");
        list.add("list 2");
        list.add("list 3");
        list.add(2,"Java");

        System.out.println(list);
int a=3;
        list.remove(3);//[list1, list 2, Java, list 3]

        list.remove("list 2");

        System.out.println(list);//    System.out.println(list);

    }
}
