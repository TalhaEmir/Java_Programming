package Arthurclass.week10;
import java.util.*;
import java.util.*;

public class Items {

    public static void main(String[] args) {
/*2. Given an ArrayList of Strings named 'items', write a program that returns the frequency of each element.
	   Example:
	      Input list: {"Apple", "Banana", "Apple", "Cherry"}

	   Output:
	      Apple = 2
	      Banana = 1
	      Cherry = 1*/


ArrayList<String>items= new ArrayList<>();
items.add("Apple");
items.add("Banana");
items.add("Apple");
items.add("Cherry");

//ilk el apple


for(int i=0; i<items.size(); i++){
    String currentItem=items.get(i);
    if(currentItem==null) continue;
    int frequency=0;
    for(int j=0; j<items.size(); j++){
        if(currentItem.equals(items.get(j))){
            frequency++;
            items.set(j,null);
        }

    }


    System.out.println( currentItem + "currentItem="+ frequency );

        }





    }
}
