package week15.Day41.MapMethods;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods {


    public static void main(String[] args) {

System.out.println("=======PUT Method======put(key,value)=====CAN NOT CHANGE KEY , YOU CAN DO VALUE===========");


        Map<String ,String> map= new LinkedHashMap<>();
        Map<String ,String> map1= new LinkedHashMap<>();


        map1.put("ap2", "Ahmed");
        map1.put("CO2", "jOSH");
        map1.put("BO3", "nORA");
        map1.put("AO4", "nORA");
        map1.put("DO3", "Abidullah");

        map.put("ap2", "Ahmed");
        map.put("CO2", "jOSH");
        map.put("BO3", "nORA");
        map.put("AO4", "nORA");
        map.put("DO3", "Abidullah");
        map.put("ZO3", "Abidullah");
        map.put("ZO4", "Abidullah");
        map.put("ZO5", "Abidullah");
        map.put("ZO6", "Abidullah");



        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get("AO4"));

        map.put("AO4","lUCY");
        System.out.println(map);
        System.out.println(map.get("AO4"));


        System.out.println("==============Get Method======You have to provide Key  ====returns the value==============");

        System.out.println(map.get("AO4"));

System.out.println("==============KeySet======You have to provide Key  ====returns the jusy key ====return type is a set because it is non duplicated===");



            System.out.println(map.keySet());//[ap2, CO2, BO3, AO4, DO3, ZO3, ZO4, ZO5, ZO6]


System.out.println("====(loop) ==Values======You have to provide vALUE ====returns the jusy VALUE ====return type is a COLLECTION because it is duplicated=ELEMENTS");




            System.out.println("==============Size Method======gonna give totoal numbers of pairs ======================");

        System.out.println(map.size());





        System.out.println("==============Replace Method======replace the value  ======================");
            map.replace("CO2", "ASEEL");
            map.replace("ZO6", "Cakir");


        System.out.println(map);



        System.out.println("==============Remove Method======REMOVE THE PAIR from Map  ======================");


        map.remove("ZO5");
        System.out.println(map);

        System.out.println("==============CONTAINS kEY======for key  ========Contains Value=========");



        System.out.println(map.containsKey("BO3"));
        System.out.println(map.containsKey("ZO5"));
        System.out.println(map.containsValue("ASEEL"));
        System.out.println(map.containsValue("Polat"));



        System.out.println("=============Is Empty ===============");


        System.out.println(map.isEmpty());//false
        System.out.println(map.equals(map1));//false
       map.clear();//false
        System.out.println(map);

        System.out.println("=============Is Empty ===============");

    }
}
/*


pair= id-name;


 */