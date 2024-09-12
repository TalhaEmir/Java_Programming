package Tekrar.Tekrar.Map.UniqueCharacters.MyUniqueCharacters;

import java.util.*;

public class UniqueCharac {

    public static void main(String[] args) {
        Map<Character, Integer> map = new LinkedHashMap<>();


        String str = "zzabbcccaaaaaaaaf";


        char[] str1= str.toCharArray();

        Character [] str2= new Character[str1.length];

        for (int i = 0; i < str1.length; i++) {
            str2[i] = str1[i];  //// char'ı Character'a çevirir
        }

        System.out.println(Arrays.toString(str2));



        for(Character each:str2 ){

            int frequency= Collections.frequency(Arrays.asList(str2),each);

            map.put(each,frequency);


            if(frequency==1){
                map.put(each,frequency);
            }else {
                map.remove(each);
            }
        }

        System.out.println(map);







    }
}
