package Tekrar.Tekrar.ArrayList.Lesson;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>();

        list.add("list1");
        list.add("list 2");
        list.add("list 3");



        System.out.println(list);//[list1, list 2, Java, list 3]
        //       index , and new element (string or int) it is updated specific element
        list.set(1,"list4");
        System.out.println(list);
    }
}
