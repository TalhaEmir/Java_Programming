package week15.Day42.MapPractice.MapSorular;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapsPracticeName {

    public static void main(String[] args) {
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);


        System.out.println(person1);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 8, 15));
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

        List<Map<String, Object>> listOfMaps = new ArrayList<>();// it is --> List of map<---- it is only accepts Map Objects
        listOfMaps.add(person1);
        listOfMaps.add(person2);


        for (Map<String, Object> eachMap : listOfMaps) {//her bir kisi liste halinde
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {// eachEntry = her bir kisinin her bir pairi her bir kisiyi parcalayip parcca parca yazdiriyor
                if (eachEntry.getKey().equals("name")) {// pek cok pair var ve onlarinda key ve valuesi onlar arasindan sadece getKey alacak
                    if (eachEntry.getValue().equals("Arthur")) {
                        eachMap.replace("name","Vassil2");
                    }
                }
            }
        }

        System.out.println(listOfMaps.get(0));




    }
}
