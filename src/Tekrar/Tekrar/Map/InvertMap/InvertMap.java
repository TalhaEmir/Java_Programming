package Tekrar.Tekrar.Map.InvertMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class InvertMap {

    public static void main(String[] args) {


        Map<Integer,Character> person1= new LinkedHashMap<>();

        Map<Character,Integer>person2= new LinkedHashMap<>();



        person1.put(1,'a');


        person1.put(2, 'b');

        person1.put(3, 'c');

        for(Map.Entry<Integer,Character > eachEntry :person1.entrySet()){

         person2.put(eachEntry.getValue(),eachEntry.getKey());

        }


        System.out.println(person2);





    }
}
