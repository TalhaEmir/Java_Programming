package week09.day24.CollectionsAndTime;
import java.util.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsUtilityMethods {


    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Ruby","Phyton","C#","Java","Swift","Swift"));
        System.out.println(names);


       /* for(int i=0; i<names.size(); i++){
            if(names.get(i).equals("Java")){
                names.set(i,"Phyton");
            }
        }
        */
        // any methods from collection should be start with the argument
        Collections.replaceAll(names,"Java","Phyton");

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(50,40,30,40,20,30 ));

        Collections.frequency(list,50);// frequency number always integer



        System.out.println(Collections.frequency(list,30));//2
        System.out.println(Collections.frequency(names,"Swift"));//2

        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(50,40,30,40,20,30,50,40,30,20,10 ));

       for(Integer each: list1){
           if(Collections.frequency(list1,each)==1){
              System.out.println(each);
               
           }
       }

    }
}
