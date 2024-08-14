package Tekrar.Tekrar.ArrayList.Lesson;

import java.util.ArrayList;

public class ArrayListAddMethod {

    public static void main(String[] args) {
        ArrayList<String>list= new ArrayList<>();

        list.add("list1");
        list.add("list 2");
        list.add("list 3");

        // you can add duplicated element
        // size is open
        //ArraysList has a specific index number

        list.add(2,"Java");// you gave specific index and add your word or character it inserting
    }
}
