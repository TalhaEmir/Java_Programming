package Tekrar.Tekrar.Days.Day23Tekrar.ArrayListMethod;

import java.util.ArrayList;

public class RemovesDuplicates {
    
    public static void main(String[]args){
//amac duplicate olanlari kaldirmak


        ArrayList<String> name=new ArrayList<>();


        name.add("Vasyl");//0
        name.add("Vasyl");//1
        name.add("Sumeye");//2
        name.add("Sumeye");
        name.add("Ali");
        name.add("Sumeye");


        ArrayList<String>dupName=new ArrayList<>();//sadece bir kez olanlari yazdircaksin


        for(int i=1 ; i<name.size();i++){
            if(dupName.contains(name.get(i))){
                continue;
            }
            dupName.add(name.get(i));

        }
        System.out.println(dupName);


        /*or

         for (String each : namesit) {
            if(nonDup.contains(each)){
              continue;
            }
            nonDup.add(each);
        }
*/
    }
}
