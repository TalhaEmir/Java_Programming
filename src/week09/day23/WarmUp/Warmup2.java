package week09.day23.WarmUp;
import java.util.ArrayList;

public class Warmup2 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1,1);//shift to the right
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);



        for (Integer element : numbers) {

            //Eğer bir değişken döngü içinde tanımlanırsa,
            // her döngü turunda bu değişken sıfırlanır veya yeniden atanır.
            // Bu, değişkenin her seferinde yeniden yaratıldığı anlamına gelir.
            int frequency = 0;
            for (Integer item : numbers) {
                if (item == element) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(element);
                break;//exiting the loop, in order to return the first unique ekements
            }



        }




    }

}

