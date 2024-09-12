package Tekrar.Tekrar.Map.Frequency;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {


        Map<Character, Integer> map = new LinkedHashMap<>();


        String str = "bbcccaaaaa";


        for (String each : str.split("")) {

            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            map.put(each.charAt(0), frequency);

        }
        System.out.println(map);

    }


}

