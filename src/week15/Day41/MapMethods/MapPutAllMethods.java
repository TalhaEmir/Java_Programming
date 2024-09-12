package week15.Day41.MapMethods;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPutAllMethods {

    public static void main(String[] args) {
        Map<String ,String> map= new TreeMap<>();

        map.put("ap2", "Ahmed");
        map.put("CO2", "jOSH");
        map.put("BO3", "nORA");
        map.put("AO4", "nORA");
        map.put("DO3", "Abidullah");

        Map<String ,String> employees= new LinkedHashMap<>(map);


        System.out.println("employees " + employees);



        employees.putAll(map);// only the pairs added object not important object class

        System.out.println(employees);//{AO4=nORA, BO3=nORA, CO2=jOSH, DO3=Abidullah, ap2=Ahmed}

        System.out.println(map==employees);//false

        System.out.println(map.equals(employees));//true

        System.out.println(map.equals(employees));//true



    }
}
