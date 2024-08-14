package week09.DAY22;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);
        //we can not skip the index number
        //numbers.add(300,2000); it is gonna give error
        System.out.println(numbers);//[100, 200, 300, 255, 400, 500]

        System.out.println("=============================");
       // for (int i = 0; i <numbers.size(); i++) {// numbers of size 0 dan baslayan bir durum icin ve son sayiyi almadigi icin lengh-1 gibi iste
        //    int each=numbers.get(i) ;
       // }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }


        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));

        }


        for (int number : numbers) {// unboxing
            
        }

        for (Integer each : numbers) {
            System.out.println(each);
        }

        
        









    }
}
