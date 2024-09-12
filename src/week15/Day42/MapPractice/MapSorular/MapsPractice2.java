package week15.Day42.MapPractice.MapSorular;

import java.time.LocalDate;
import java.util.*;

public class MapsPractice2 {

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

        List<Map<String, Object>> listOfMaps = new ArrayList<>();// it is --> List of map<---- it is only accepts Map Objects
        listOfMaps.add(person1);
        listOfMaps.add(person2);

        System.out.println(listOfMaps);
//[{name=Arthur, gender=M, age=32, job_title=Developer, salary=100000.5, hired_date=2021-01-15, married=true}, {name=Nora, gender=F, age=31, job_title=Back-end Developer, salary=90000, hired_date=2022-08-15, married=true}]
        listOfMaps.addAll(Arrays.asList(person3, person4, person5));

        System.out.println(listOfMaps);


        System.out.println("================  // how can we iterate list of map==========================");





        System.out.println("================1====Ilk Loop============");


        for (Map<String, Object> eachMap : listOfMaps) {// nested Loop multi dimension ARRAY Gibi dusun
            System.out.println(eachMap);
        }


        System.out.println("================2======Ikinci Loop entryler icin=======");


        for (Map<String, Object> eachMap : listOfMaps) {// nested Loop multi dimension ARRAY Gibi dusun
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {// Her bir person icin icerideki entryleri yazdircak
                System.out.println(eachEntry);
            }
        }



            System.out.println("================  Sorunun cozumu==========================");


            for (Map<String, Object> eachMap : listOfMaps) {// nested Loop multi dimension ARRAY Gibi dusun
                for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {// Her bir person icin icerideki entryleri yazdircak
                    System.out.println(eachMap);
                    if (eachEntry.getKey().equals("hired_date")) {
                        System.out.println(eachEntry.getValue());// burada cagiriyoruz ama icinden sadece yili almamiz lazim.
                        // bu durumda bu kisimda yani down casting yapmamiz lazim cunku objemis object LocalDateTime degil
                        //asagida paylasiyorum ikinci loopu anlaman icin Emir
                    }
                }

            }
            System.out.println("================  // display the names of the employee who are hired this year  2022======================");

            for (Map<String, Object> eachMap : listOfMaps) {//her bir kisi liste halinde
                for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {// eachEntry = her bir kisinin her bir pairi her bir kisiyi parcalayip parcca parca yazdiriyor
                    if (eachEntry.getKey().equals("hired_date")) {// pek cok pair var ve onlarinda key ve valuesi onlar arasindan sadece getKey alacak
                        if (((LocalDate) eachEntry.getValue()).getYear() == 2022) {
                            System.out.println(eachMap.get("name"));
                        }
                    }
                }
            }


        System.out.println("================  // how can we change name 1====================");


        for (Map<String, Object> eachMap : listOfMaps) {//her bir kisi liste halinde
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {// eachEntry = her bir kisinin her bir pairi her bir kisiyi parcalayip parcca parca yazdiriyor
                if (eachEntry.getKey().equals("name")) {// pek cok pair var ve onlarinda key ve valuesi onlar arasindan sadece getKey alacak
                    if (eachEntry.getValue().equals("Arthur")) {
                        eachEntry.setValue("Vassil");
                    }
                }
            }
        }

        System.out.println(listOfMaps); // or


        listOfMaps.get(0).replace("name","Vassil2");

        System.out.println(listOfMaps.get(0));


        listOfMaps.get(listOfMaps.size()-1).replace("salary", ((Integer)listOfMaps.get(listOfMaps.size()-1).get("salary")+50000));// objecti cast yapman lazim
        System.out.println(listOfMaps);


        System.out.println("================  // how can we change age====================");


        listOfMaps.get(1).replace("age", ((Integer)listOfMaps.get(1).get("age")+4));// objecti cast yapman lazim


        System.out.println(listOfMaps);


    }

}