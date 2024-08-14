package week09.day24.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class SameFirstAndLast {

    public static void main(String[] args) {

       /* Create a class called SameFirstAndLast and write a program with the following specifications:
        11.1 Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.

                Example:
        list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

        output:
				["Canada", "Lan", "Ebrahim", "Farida"]*/


        List<String>list=new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        list.removeIf(p->p.charAt(0)==p.charAt(p.length()-1));
        list.removeIf(p->p.substring(0,1).equalsIgnoreCase(p.substring(p.length()-1)));

    }
}
