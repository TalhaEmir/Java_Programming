package Tekrar.Tekrar.Map.UniqueCharacters;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {

        Map<Character, Integer> map = new LinkedHashMap<>();


        String str = "bbcccaaaaa";


        for (String each : str.split("")) {

            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            map.put(each.charAt(0), frequency);

            if(frequency==1){
                map.put(each.charAt(0), frequency);
            }else{
                map.remove(each.charAt(0));
            }

        }


        System.out.println(map);
    }
}
