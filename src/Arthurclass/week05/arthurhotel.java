package Arthurclass.week05;

import java.util.Scanner;

public class arthurhotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Java Hotel\nHow many days will you stay");
        int numberOfDays = input.nextInt();
        System.out.println("How many people are in your party?");
        int numberOfPeople = input.nextInt();


        String roomType="";
        int price=0;
        boolean isValid=true;


        switch (numberOfPeople) {
            case 1:
                roomType="single Room";
                price=numberOfDays*100;
                break;
                case 2:
                roomType="double room";
                price=numberOfDays*125;
                break;// enhanced switch statement you can do or back to back with coma like (case3,4:) or case
                //(case3,4:)
                case 3:
                case 4:
                    roomType="large Room";
                    price=numberOfDays* numberOfPeople* 50;
                    break;
                case 5,6:
                    roomType= "suite";
                    price=numberOfDays*1000;
                    break;
            default:
                isValid=false;
        }


        if (isValid){
            System.out.println("Room you are assigned is " + roomType +"for"+ numberOfDays + "days and"+ numberOfPeople + "people it will cost $" + price);
        }else {
            System.out.println("is not valid group size");
        }


       //opt3 TERNARY
    System.out.println("Room you are assigned is " + roomType +"for"+ numberOfDays + "days and"+ numberOfPeople + "people it will cost $" + price);

        //op4

        String validResult="\"Room you are assigned is \" + roomType +\"for\"+ numberOfDays + \"days and\"+ numberOfPeople + \"people it will cost $\" + price";
        String invalidResult= numberOfPeople + "is not valid gorup size";

        System.out.println(isValid? validResult:invalidResult);



















    }
}