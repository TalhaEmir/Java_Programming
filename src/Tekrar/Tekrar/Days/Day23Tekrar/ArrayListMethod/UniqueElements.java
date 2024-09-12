package Tekrar.Tekrar.Days.Day23Tekrar.ArrayListMethod;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {
        ArrayList<String> namesit=new ArrayList<>();

        namesit.add("Java");//0
        namesit.add("C**");//1
        namesit.add("Phyton");//2
        namesit.add("Java");
        namesit.add("Ruby");
        namesit.add("C+");
        namesit.add("java");
        namesit.add("phyton");
        namesit.add("Ruby");
        namesit.add("c++");
        namesit.add("phyton");

        for(String each: namesit){
            if(namesit.indexOf(each)==namesit.lastIndexOf(each)){
                System.out.println(each);
                break;
            }
        }
    }
}
