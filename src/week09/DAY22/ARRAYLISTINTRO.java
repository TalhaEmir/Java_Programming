package week09.DAY22;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;


public class ARRAYLISTINTRO {

    public static void main(String[] args) {

        ArrayList<String>list2=new ArrayList<>();


        ArrayList<String>list=new ArrayList<>(); // sag taraftaki <String> icine yazmasakta String olur. yazmadik:)


        //add method("Cydeo")

        System.out.println(list);

        list.add("Cydeo");
        list.add("JAVA");
        list.add("SDET");
        list.add(1,"Phyton");
        //size Method

        System.out.println(list);

        int totalElement=list.size();
        System.out.println("total Elements=" + totalElement);
        //GETMETHOD
        list.get(2);// "SDET"
        System.out.println(list.get(2));//JAVA
        String thirdElement=list.get(2);//JAVA
        System.out.println("thirdElement=" + thirdElement);//thirdElement=JAVA

        //long video ArraylistIntro





    }
}
