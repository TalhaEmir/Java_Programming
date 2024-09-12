package Tekrar.Tekrar.Collections.Task.Anagram;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(anagram("abdc","bcdaaaaacccdddd"));


        }


public static boolean anagram(String first, String second ){



    String [] str3= first.split("");
    String [] str4= second.split("");

    Set<String> list3= new TreeSet<>(Arrays.asList(str3));
    Set<String> list4= new TreeSet<>(Arrays.asList(str4));

    System.out.println(list3);
    System.out.println(list4);

    if(list3.equals(list4)){
        return true;
    }

    return false;
}


}
/*Create a class named Anagram and write a program that checks if two strings are anagrams of each other, considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false*/