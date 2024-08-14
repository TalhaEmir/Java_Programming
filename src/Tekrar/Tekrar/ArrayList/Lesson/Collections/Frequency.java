package Tekrar.Tekrar.ArrayList.Lesson.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Frequency {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,10,30,30,30,0,20,20,20, 2, 3, 4, 5,10));
        System.out.println(list);//[1, 10, 30, 30, 30, 0, 20, 20, 20, 2, 3, 4, 5, 10]

        Collections.frequency(list,10);


        int num=  Collections.frequency(list,10);

        System.out.println(num);//2

    }
}
