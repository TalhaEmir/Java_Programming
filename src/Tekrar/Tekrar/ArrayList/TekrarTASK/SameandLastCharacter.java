package Tekrar.Tekrar.ArrayList.TekrarTASK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class SameandLastCharacter {

    public static void main(String[] args) {


        ArrayList<String>list=new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        System.out.println( list);

        list.removeIf(p->Character.toLowerCase(p.charAt(0))==p.charAt(p.length()-1));


        System.out.println( list);
    }
}
/*11. Create a class called SameFirstAndLast and write a program with the following specifications:
    11.1 Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.

			Example:
				list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

			output:
				["Canada", "Lan", "Ebrahim", "Farida"]


*/
