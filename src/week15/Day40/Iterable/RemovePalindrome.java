package week15.Day40.Iterable;

import week10.Day27.Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindrome {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Ahmed","ada","AMA", "AHmed", "ahMED", "John", "Ercon", "Daniel", "mustafa", "Mohammed", "Ahmed"));


        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String each = it.next();

            String reverse = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }

            if(each.equalsIgnoreCase(reverse)){
               //names.remove(each); wrong method because at the

                it.remove();// bu da olur
                // iterate remove da olur birbiriyle baglantil idogru calisir
            }


        }

        System.out.println(names);


       //================================================================\\


        List<String> names2 = new ArrayList<>();

        names2.addAll(Arrays.asList("Ahmed","ada","AMA", "AHmed", "ahMED", "John", "Ercon", "Daniel", "mustafa", "Mohammed", "Ahmed"));

        names2.removeIf(p-> StringUtility.reverse(p).equalsIgnoreCase(p));

        System.out.println(names2);

    }

}
