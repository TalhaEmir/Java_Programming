package Tekrar.Days.Day23Tekrar.ArrayListMethod;
import java.util.ArrayList;
public class GetMethods {
    public static void main(String[] args) {



        ArrayList<String>words=new ArrayList<>();
        words.add("a");
        words.add("b");
        words.add("c");

        //jut give it indeks

        words.get(2);
        System.out.println(words.get(2));//c
        System.out.println(words.get(words.size()-1));//c
    }
}
