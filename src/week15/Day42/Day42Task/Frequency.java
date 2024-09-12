package week15.Day42.Day42Task;

import java.util.*;

public class Frequency {

    public static void main(String[] args) {

        Map<Character,Integer>map=new LinkedHashMap<>();


        String str="bbcccaaa";

       for(String each: str.split("")){
            int frequency= Collections.frequency(       Arrays.asList(str.split("")   )      ,each);
            System.out.println(each+ " : " + frequency);

            map.put(each.charAt(0), frequency);
           }

       System.out.println(map);//{b=2, c=3, a=3}



        //Sorunun cevabı şu: each.charAt(0) ifadesi, her bir each değişkeninin sıfırıncı indeksindeki karakteri alır.
        // Ancak her döngü turunda each zaten tek bir karakterden oluşuyor
        // (çünkü str.split("") ile her karakter ayrı bir string olarak alınır),
        // bu yüzden her zaman sadece ilk (ve tek) karakteri alıyorsun.

        }




/*1. Write a program that can return the frequency of characters
            Not: MUST use map

                Ex: str = "bbcccaaaaa"

                output:
                    {b=2, c=3, a=5}*/



}
