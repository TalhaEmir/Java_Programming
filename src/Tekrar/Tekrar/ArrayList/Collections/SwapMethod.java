package Tekrar.Tekrar.ArrayList.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,10,30,30,30,0,20,20,20, 2, 3, 4, 5,10));
        System.out.println(list);//[1, 10, 30, 30, 30, 0, 20, 20, 20, 2, 3, 4, 5, 10]

        Collections.swap(list, 1, 9);// swap icin indeks veriliyor numaralar indeksi gosterir

        System.out.println(list);

    }
}
