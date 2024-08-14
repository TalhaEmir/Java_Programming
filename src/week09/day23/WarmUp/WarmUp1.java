package week09.day23.WarmUp;
import java.util.ArrayList;

public class WarmUp1 {
    public static void main(String[] args) {

        //average bulacaksan toplam sayiyo buluoyorsun

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(1);//burada her seferinde autoboxing oluyor
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        numbers.add(6);
        System.out.println(numbers);
        System.out.println(numbers.size());

        int sum=0;

        for (Integer each : numbers) {
          sum+=each;

        }

        double average=sum/(double)numbers.size();
        System.out.println(average);




    }
}
