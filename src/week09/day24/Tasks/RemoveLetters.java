package week09.day24.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class RemoveLetters {

    public static void main(String[] args) {

       /* 10. Create a class called RemoveLetters and write a program with the following steps:
        10.1 Given an ArrayList of characters, remove all the letters.

                Example:
        list = {'$', A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'}

        output:
				['$',  '1', '2', '@', '!', '3', '4']*/

        List<Character>list =new ArrayList<>(Arrays.asList('$','A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4' ));

        list.removeIf(p->Character.isLetter(p));
        System.out.println(list);


    }
}
