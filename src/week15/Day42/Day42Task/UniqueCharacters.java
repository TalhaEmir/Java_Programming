package week15.Day42.Day42Task;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str="aabcccdeeeef";

        Map<Character,Integer> map=new LinkedHashMap<>();


        for(String each: str.split("")){
            int frequency= Collections.frequency( Arrays.asList(str.split("")),each);
            System.out.println(each+ " : " + frequency);


            if(frequency==1){
                map.put(each.charAt(0), frequency);
            }else{
                map.remove(each.charAt(0));
            }


        }

        System.out.println(map);
    }
}
/*2. Write a program that can find the unique characters from a String
	              Not: MUST use map
	            Ex:
	                    str = "aabcccdeeeef";

	            output:
	                    {b=1, d=1, f=1}*/