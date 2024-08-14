package Arthurclass.week05;
import week04.day08.SwitchStatement.SwitchIntro;

import java.util.Scanner;

public class morning {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello would you like drinks or snacks");
        String mainOption = input.next();
        mainOption = mainOption.toLowerCase();
        double price = 0;

        switch (mainOption) {
            case "drinks":
                System.out.println("1)Water\n2)Coffee\n3)Soda\n4)Energy Drink");
                int drinkOption = input.nextInt();

                if (drinkOption==1) {
                    price = 1.99;
                } else if (drinkOption==2) {
                    price = 3.99;
                } else if (drinkOption==3) {
                    price = 1.50;
                } else if (drinkOption==4) {
                    price = 4.00;
                }
                break;

            case "snacks":
                System.out.println("1)chips\n 2)cookies\n3)Carrots");
                int snakeOption = input.nextInt();
            switch (snakeOption) {}
            case "1":
                price = 1.45;
                break;
            case "2":
                price = 3.40;
                break;
            case "3":
                price = 1.30;
                break;


        }
        input.close();

        if (price != 0) {
            System.out.println("price:" + price);
        } else {
            System.out.println("Sorry invalid");
        }

    }

}