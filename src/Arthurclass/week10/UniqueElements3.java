package Arthurclass.week10;
import java.util.*;

public class UniqueElements3 {
    public static void main(String[] args) {

        //System.out.println(uniqueElements);//[]// is wrong


        String[] inputArray = {"Java", "Python", "Python", "Python", "Ruby", "Ruby", "C#"};


        ArrayList<String> uniqueElements = new ArrayList<>();


        ArrayList<String> duplicatedElements = new ArrayList<>();


        for (String element : inputArray) {

            if (!uniqueElements.contains(element) && !duplicatedElements.contains(element)) {
                uniqueElements.add(element);

            } else {
                uniqueElements.remove(element);//kaldir
                duplicatedElements.add(element);//ekle

            }


        }

        System.out.println(uniqueElements);
        System.out.println(duplicatedElements);
    }

}