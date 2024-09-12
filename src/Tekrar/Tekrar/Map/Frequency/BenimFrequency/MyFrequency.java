package Tekrar.Tekrar.Map.Frequency.BenimFrequency;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyFrequency {

    public static void main(String[] args) {
        String str="bbcccaaaaa";

        char[] charArray = str.toCharArray();

        Character[] characterArray = new Character[charArray.length]; //// char'ı Character'a çevirir

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < charArray.length; i++) {
            characterArray[i] = charArray[i];  //// char'ı Character'a çevirir
        }



        for(char ch: characterArray){

            int frequency= Collections.frequency(Arrays.asList(characterArray),ch);

            map.put(ch,frequency);

        }


       System.out.println(map);



    }
}
