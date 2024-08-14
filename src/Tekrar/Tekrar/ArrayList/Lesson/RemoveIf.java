package Tekrar.Tekrar.ArrayList.Lesson;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,10,30,30,30,0,20,20,20, 2, 3, 4, 5,10));
        System.out.println(list);//[1, 10, 30, 30, 30, 0, 20, 20, 20, 2, 3, 4, 5, 10]

        list.removeIf(p-> p<4 );

        }
    }

