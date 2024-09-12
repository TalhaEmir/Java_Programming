package week15.Day41.MapMethods;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {

    public static void main(String[] args) {

        Map<String ,Integer> map= new LinkedHashMap<>();


        map.put("daniel", 95000);
        map.put("emile", 100000);
        map.put("cemile", 85000);
        map.put("bella", 78000);
        map.put("jimmy", 98000);
        map.put("brenna", 97000);



        System.out.println("// =================iterating the map by the keys============\\");

        System.out.println(map.keySet());//[daniel, emile, cemile, bella, jimmy, brenna]
        System.out.println(map.values());//[95000, 100000, 85000, 78000, 98000, 97000]

        System.out.println(map.get("daniel"));//95000

        for(String eachKey: map.keySet()){// every single key
            System.out.print(eachKey+"\n");//danielemilecemilebellajimmybrenna


           map.replace(eachKey, map.get(eachKey)*2); // ilki key digeri value ma valueyi key ile ifade ediyor cunku get key dediginde zaten  valueyi vercek

            // get kullaniliyor burada

            // getEachkey yani bir nevi getey demek value demek direk valueyi cagirmak demek

        }

        System.out.println(map);//{daniel=190000, emile=200000, cemile=170000, bella=156000, jimmy=196000, brenna=194000}




        System.out.println("// =================iterating the map by the Value============\\");

            for(Integer eachValue: map.values()){
                System.out.print(eachValue);//190000200000170000156000196000194000

            }


        System.out.println("// =================iterating the map by entry( daniel, 95000)=========\\");

        System.out.println(map.entrySet());//[daniel=190000, emile=200000, cemile=170000, bella=156000, jimmy=196000, brenna=194000]




        for(Map.Entry<String, Integer > eachEntry :map.entrySet()){
                System.out.println(eachEntry);
            }

        System.out.println("// =================iterating the map by entry =========\\");

        for(Map.Entry<String, Integer > eachEntry :map.entrySet()){

            String eachKey=eachEntry.getKey();

            Integer eachValue=eachEntry.getValue();

            eachEntry.setValue( eachValue + 10000);

            System.out.println(eachKey+ ":" + eachValue);



        }

        System.out.println(map);



    }
}
