package week15.Day41.MapClasses;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapClasses {

    public static void main(String[] args) {


        System.out.println("================================hashMap==================================");



        Map<String,Integer>hashMap= new HashMap<>();// random order , accepts null key null value,accepts multiple null value

        hashMap.put("Daniel",95000);
        hashMap.put("Emily",100000);
        hashMap.put("Bella", 85000);
        hashMap.put("Bella",80000);

        hashMap.put("Arron",78000);
        hashMap.put("Chris",null);
        hashMap.put("Brenna",null);
        hashMap.put(null,null);
        hashMap.put(null,11000);
        hashMap.put(null,10000);


        System.out.println(hashMap);


        System.out.println("================================linkedHashMap====================================================");


        Map<String,Integer>linkedHashMap= new LinkedHashMap<>();// insertion (index) order , accepts null key null value, accepts multiple null value


        linkedHashMap.put("Daniel",95000);
        linkedHashMap.put("Emily",100000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Bella",80000);

        linkedHashMap.put("Arron",78000);
        linkedHashMap.put("Chris",null);
        linkedHashMap.put("Brenna",null);
        linkedHashMap.put(null,null);
        linkedHashMap.put(null,11000);
        linkedHashMap.put(null,10000);

        System.out.println(linkedHashMap);


        System.out.println("================================TreeMAP====================================================");

        Map<String,Integer>treeMap= new TreeMap<>();// sorted order (less first larger last ) , doesnt accepts null key but accepts null value

        treeMap.put("Daniel",95000);
        treeMap.put("Emily",100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Bella",80000);

        treeMap.put("Arron",78000);
      //  treeMap.put("Chris",null);
      //  treeMap.put("Brenna",null);// value can not be null
       // treeMap.put(null,null); value can not be null
       // treeMap.put(null,11000);// key can not be null
      //  treeMap.put(null,10000);

        System.out.println( "teeMap" + treeMap);
        System.out.println("================================HashTable====================================================");



        Map<String,Integer>hashTable= new Hashtable<>();// random order , does not accepts null key and null value , senkronized


        hashTable.put("Daniel",95000);
        hashTable.put("Emily",100000);
        hashTable.put("Bella", 85000);
        hashTable.put("Bella",80000);

        hashTable.put("Arron",78000);
       // hashTable.put("Chris",null); value at HashTable can not be null
       // hashTable.put("Brenna",null);// value can not be null
       // hashTable.put(null,null);
        //hashTable.put(null,11000);// key can not be null

       try {
           hashTable.put("Dian a", 10000);
       }catch(RuntimeException e){
        e.printStackTrace();
        }


        System.out.println("hashtable " + " calisiyor " + hashTable);
    }


}



/*


DANIEL = 95.000
Emily= 100000
Bella=85000;
 */
