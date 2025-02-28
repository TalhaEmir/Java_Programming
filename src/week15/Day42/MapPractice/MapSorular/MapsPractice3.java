package week15.Day42.MapPractice.MapSorular;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapsPractice3 {

    public static void main(String[] args) {
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);


        System.out.println(person1);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 8, 31));
        person2.put("married", true);


        System.out.println(person2.get("name"));
        System.out.println(person2.get("job_title"));


        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 31);
        person3.put("job_title", "Front-End Developer");
        person3.put("salary", 90000);
        person3.put("hired_date", LocalDate.of(2022, 9, 15));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Abidullah");
        person4.put("gender", 'M');
        person4.put("age", 31);
        person4.put("job_title", "Java Developer");
        person4.put("salary", 90000);
        person4.put("hired_date", LocalDate.of(2022, 8, 15));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 31);
        person5.put("job_title", "Back-end Developer");
        person5.put("salary", 90000);
        person5.put("hired_date", LocalDate.of(2022, 10, 15));
        person5.put("married", true);


        Map<String, Object>[]arrayOfMap=new Map[5];// data type map so your data is should be map

        System.out.println(Arrays.toString(arrayOfMap));



        arrayOfMap[0]=person1;
        arrayOfMap[1]=person2;
        arrayOfMap[2]=person3;
        arrayOfMap[3]=person4;
        arrayOfMap[4]=person5;

        // we gonna increase secind person salary 10000


        arrayOfMap[1].replace("salary",( (Integer)arrayOfMap[1].get("salary")+10000));
       System.out.println(arrayOfMap[1].get("salary"));


        arrayOfMap[0].replace("name","Hasan");

        System.out.println(Arrays.toString(arrayOfMap));

       System.out.println("==========How many workers and their saalary under 100000");


       int numberOfTheirSalaryUnderThe100K=0;
       for(Map<String, Object > eachMap: arrayOfMap){
            for(Map.Entry<String, Object> eachEntry: eachMap.entrySet()){
                if(eachEntry.getKey().equals("salary")){
                   if((Integer)eachEntry.getValue()>100000){
                        //double salary= (Double)eachEntry.getValue
                        //if(salar<100000{
                        //count++;
                        numberOfTheirSalaryUnderThe100K++;
                    }
                }
            }
       }



    }
}
