package Tekrar.Tekrar.Collections.Task.Palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Palindrome {

    public static void main(String[] args) {
        String [] list={ "Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"};


        List<String>list2=new ArrayList<>(Arrays.asList(list));


        Iterator<String>it= list2.iterator();


        while(it.hasNext()){
            String each=it.next();
            String reverse="";

            for(int i= each.length()-1; i>=0 ; i-- ){
                reverse += each.charAt(i);
            }


            if(each.equalsIgnoreCase(reverse)){
                it.remove();
            }




        }

        System.out.println(list2);



    }
}
