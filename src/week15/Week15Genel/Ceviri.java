package week15.Week15Genel;

import java.util.*;

public class Ceviri {
    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,20,20,20,30,40,40,50,60,70,5,5,5,5,1,11,1,2,2,2,2));

        Set<Integer> n= new TreeSet<>(numbers);// converting to the List to Set cunli spesifik bir islem istiyourz non duplicated gibi

        System.out.println(n);//[1, 2, 5, 10, 11, 20, 30, 40, 50, 60, 70]


        numbers= new ArrayList<>(n);


    }
}
