package Tekrar.Tekrar.ArrayList.Lesson;

import java.util.ArrayList;

public class AddMethod {

    public static void main(String[] args) {

        ArrayList<String>list=new ArrayList<>();

        list.add("Cydeo");
        list.add("Java");
        list.add("SDET");
        list.add(3,"Phyton");


        System.out.println(list);



        int totalElements=list.size();

        System.out.println(" total elements " + totalElements);

        String thirdElement= list.get(2);

    }
}
