package Tekrar.Tekrar.Loops.Tasks;

import java.util.Scanner;

public class Minimum {

    public static void main(String[] args) {



    int number = 0;

    int min=0;

        while (number <= 5) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        if (num<min){
            min=num;
        }
        number++;

    }
        System.out.println(min);
}
}

