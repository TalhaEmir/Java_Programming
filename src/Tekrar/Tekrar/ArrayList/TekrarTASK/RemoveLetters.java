package Tekrar.Tekrar.ArrayList.TekrarTASK;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {

    public static void main(String[] args) {
        ArrayList<Character>list=new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'));

        list.removeIf(p->Character.isLetter(p));


        System.out.println(list);
    }
}
