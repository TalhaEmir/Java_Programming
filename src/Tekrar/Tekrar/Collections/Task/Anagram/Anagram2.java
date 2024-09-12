package Tekrar.Tekrar.Collections.Task.Anagram;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Anagram2 {

    public static void main(String[] args) {

        String str1="abcd";
        String str2="ccddabaa";
        String [] str3= str1.split("");
        String [] str4= str2.split("");

        Set<String> list3= new TreeSet<>(Arrays.asList(str3));
        Set<String> list4= new TreeSet<>(Arrays.asList(str4));

        System.out.println(list3);
        System.out.println(list4);


        System.out.println(list3.equals(list4)?"Anagram":"NotAnagram");


    }
}
