package Arthurclass.week05;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class hotel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Java Hotel\nHow many days will you stay");
        int numberOfDays = input.nextInt();
        System.out.println("How many people are in your party?");
        int people = input.nextInt();


       String roomType = "";
        double price=0.0;

        if (people>0 && 6>= people){

            if(people==1){
                price= numberOfDays*100;
                roomType=" Single Room";
            }else if (people==2 ){
                price=numberOfDays*125;
                roomType=" Double Room";
            }else if (people==3 ){

                price=numberOfDays*150*people;
            }else if ((people==6 || people==5) && roomType.equals("Suite")){
                price=numberOfDays*1000*people;

            }else {
                System.out.println("Invalid room type for the given number of people.");
            }



        }else{
            System.out.println("sorry $number_of_people is not a valid group size");
        }
        System.out.println(price);


    }

}
