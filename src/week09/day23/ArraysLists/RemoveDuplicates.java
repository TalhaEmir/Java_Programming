package week09.day23.ArraysLists;
import java.util.ArrayList;
import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {

//tkerarlayanlari yazdirma
        ArrayList<String>namesit=new ArrayList<>();

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

        ArrayList<String> nonDup=new ArrayList<>();

        for (String each : namesit) {
            if(nonDup.contains(each)){
              continue;
            }
            nonDup.add(each);
        }


namesit=nonDup;// it is deleting old one
        System.out.println(namesit);
    }
}
