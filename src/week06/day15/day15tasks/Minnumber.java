package week06.day15.day15tasks;

import java.util.Scanner;

public class Minnumber {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int min= 325436645;

        // 5 numara arasinda en kucugu yazdircaz
        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter your number ");// 5 kez sayi verecek
            int number = input.nextInt(); // 5 kez vermemz geekenb numaranin code u
            if (number < min) { // burada eyer verdigimiz min number minden buyukse min numaramiz olacak en son kayitli kucuk sayi kalcak
                min = number;
            }


        }

        System.out.println(min);

    }
}
