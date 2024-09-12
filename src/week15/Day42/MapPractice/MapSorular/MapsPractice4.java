package week15.Day42.MapPractice.MapSorular;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapsPractice4 {
    public static void main(String[] args) {



        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);




        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 8, 31));
        person2.put("married", true);





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



        Map<Integer, Map<String, Object>> mapOfMaps= new LinkedHashMap<>();
        mapOfMaps.put(0,person1);// String object kismina ekleniyor
        mapOfMaps.put(1,person2);// String object kismina ekleniyor
        mapOfMaps.put(2,person3);// String object kismina ekleniyor
        mapOfMaps.put(3,person4);// String object kismina ekleniyor
        mapOfMaps.put(4,person5);// String object kismina ekleniyor


        System.out.println(mapOfMaps.get(1).replace("salary", 120000));

System.out.println(mapOfMaps.get(1));


        System.out.println("Butun Mapleru yazdirmak icin sonuc olarak kullandigimiz object Mapse valulari yazidrmak gerekir ");
        System.out.println("Cunku Map<Integer, Map > bu ksimda key Integer Map value");


        System.out.println("=========================Printing every map=================");

        for (Map<String, Object> eachValue : mapOfMaps.values()) {
            System.out.println(eachValue);
        }


        System.out.println("=========================increasing the salaries 100000$$$=================");


        for (Map<String, Object> eachValue : mapOfMaps.values()) {
            for(Map.Entry<String, Object>eachEntry : eachValue.entrySet()){
                if(eachEntry.getKey().equals("salary")){
                    eachEntry.setValue( (Integer)eachEntry.getValue() +10000);
                }
            }

        }
        System.out.println(mapOfMaps);

        System.out.println("=========================increasing the salaries 100000$$$=================");

        Map<Map <String, Integer> , Map <String, Object>> mapOfMaps2= new LinkedHashMap<>();




    }
}
