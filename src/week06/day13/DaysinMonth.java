package week06.day13;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DaysinMonth {

    public static void main(String[] args) {

        int month=new Scanner(System.in).nextInt();


        if (month<1 || month>12){
            System.err.println("Invalid month");
            return;// terminates the main method
        }

        switch(month){

            case 2:
                System.out.println("28 days");
            break;

            case 4:case 6:case 9: case 11:

                System.out.println("30 days");

                break;

            default:
                System.out.println("31 days");


        }

    }
}
