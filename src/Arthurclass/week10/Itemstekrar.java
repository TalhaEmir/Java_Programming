package Arthurclass.week10;
import java.util.*;

import java.util.ArrayList;

public class Itemstekrar {


    public static void main(String[] args) {


        ArrayList<String> items= new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Apple");
        items.add("Cherry");

        for(int i=0; i<items.size(); i++){
            String currentItems=items.get(i);
            int frequency=0;
            if(currentItems==null){
                continue;
            }
            for(int j=0; j<items.size(); j++){
                if(currentItems.equals(items.get(j))){
                    frequency++;
                    items.set(j,null);
                }

            }

            System.out.println( currentItems + "currentItem="+ frequency );
        }



    }
}
