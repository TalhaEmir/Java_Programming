package week15.Day42.MapPractice.MapSorular;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {


        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("---------------how many female & male employees in the map?---------------");
        // how many female & male employees in the map?
        int countMaleEmployee = 0;
        int countFemaleEmployees = 0;
/*
        for(String name: employeeMap.keySet()){

            String gender=employeeMap.get(name);
            if(gender.equals("M")){
                countMaleEmployee++;
            }else{
                countFemaleEmployees++;
            }
            */

        for (String eachValue : employeeMap.values()) {
            if (eachValue.equals("M")) {
                countMaleEmployee++;

            } else {
                countFemaleEmployees++;

            }

            System.out.println("Male Employees " + countMaleEmployee + "Female Employees" + countFemaleEmployees);

        }

        System.out.println("---------------display the names of all the female employees---------------");


        for(String name: employeeMap.keySet()){

            String gender= employeeMap.get(name);

            if(gender.equals("F")){
                System.out.println(name);
            }

        }


        for(Map.Entry<String, String > eachEntry :employeeMap.entrySet()){
            System.out.println(eachEntry);
            if(eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }
        }


        System.out.println("---------------update all the M values to F ,F to M---------------");

        for(Map.Entry<String, String > eachEntry :employeeMap.entrySet()){
            System.out.println(eachEntry);
            if(eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            }else{
                eachEntry.setValue("Female");
            }
        }
        System.out.println(employeeMap);





    }


}