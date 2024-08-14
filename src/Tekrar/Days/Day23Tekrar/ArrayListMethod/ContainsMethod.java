package Tekrar.Days.Day23Tekrar.ArrayListMethod;

import java.util.ArrayList;

public class ContainsMethod {

    public static void main(String[] args) {
        //contains method
        //always return String

        ArrayList<String> name = new ArrayList<>();
        name.add("Alha");
        name.add("tAlha");
        name.add("pAlha");
        name.add("lAlha");

        name.contains("Alha");
        System.out.println(name.contains("Alha"));//true


        boolean hasAlha=name.contains("Alha");
        System.out.println(hasAlha);//true

    }
}
