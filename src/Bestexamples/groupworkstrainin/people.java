package Bestexamples.groupworkstrainin;
import java.util.Scanner;

public class people {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you live with?");
        int number = input.nextInt();

        String result ="";

        if(number < 3){
            result = "Live with less than 3 people";
        }else if(number<=6){
            result = "Live with 3 - 6 people";
        }else{
            result = "Live with more than 6 people";
        }

        System.out.println(result);


    }

    }
