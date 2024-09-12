package Tekrar.Tekrar.Map.MergeMaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MergeMaps {


    public static void main(String[] args) {


        Map<Character, Integer> person1 = new LinkedHashMap<>();

        person1.put('a', 10);


        person1.put('b', 20);


        Map<Character, Integer> person2 = new LinkedHashMap<>();


        person2.put('b', 30);

        person2.put('c', 40);

        int number = 0;

        Map<Character, Integer> person3 = new LinkedHashMap<>();


        for(Map.Entry<Character, Integer > eachEntry :person1.entrySet()){

            person3.put(eachEntry.getKey(), eachEntry.getValue());

            for(Map.Entry<Character, Integer > eachEntry2 :person2.entrySet()){
                if(eachEntry.getKey()==eachEntry2.getKey()){
                   person3.put(eachEntry2.getKey(),eachEntry.getValue()+eachEntry2.getValue() );
                }else {
                    person3.put(eachEntry2.getKey(),eachEntry2.getValue());
                }
            }
        }

        System.out.println(person3);




        }

}

