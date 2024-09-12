package Tekrar.Tekrar.Map.MultiplyOdds;

import java.util.LinkedHashMap;
import java.util.Map;

public class MultiplyOdds {

    public static void main(String[] args) {

        Map<Character,Object> person1= new LinkedHashMap<>();

        person1.put('a',1);


        person1.put('b', 2);

        person1.put('c', 3);

        person1.put('d', 4);

        person1.put('e', 5);

        for(Map.Entry<Character, Object > eachEntry :person1.entrySet()){
            if(((Integer)eachEntry.getValue()%2!=0)) {
                eachEntry.setValue(((Integer) eachEntry.getValue() * 2));
            }
        }

        System.out.println(person1);


    }
}
