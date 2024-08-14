package MurodilSessions.week10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeReview {

    public static void main(String[] args) {

        //get current date to today variable

        LocalDate today=LocalDate.now();
        System.out.println("today=" + today);
        // add 100 days
        LocalDate daysAfter= today.plusDays(100);

        System.out.println("daysAfter= " + daysAfter);

        // print day  of the week for today and after 100 days
        System.out.println("todays day of week = "+ today.getDayOfWeek());
        System.out.println("100 day of week = "+ daysAfter.getDayOfWeek());

        // print day of the year each one
        System.out.println("todays day of year = "+ daysAfter.getDayOfYear());
        System.out.println("100 day of week = "+ daysAfter.getDayOfYear());

        //create date for december 31 2024
        LocalDate lastDayOf2024= LocalDate.of(2024,12,31);
        System.out.println("lastDayof2024 = "+ lastDayOf2024);
        System.out.println("lastDayof the year = "+ lastDayOf2024.getDayOfYear());

        // 30 days return period.
        //purchaseDate and returnDate then print" eligible for return" or not :not eligible for return
        LocalDate purchaseDate= LocalDate.of(2024,1,15);
        LocalDate returnDate= LocalDate.of(2024,2,5);


        if(returnDate.isBefore(purchaseDate.plusDays(30))){
            System.out.println("not eligible for return");
        }

        //store opens at 6 am closes at 9m
        //check is store is open right now


        System.out.println("LocalTime.now" + LocalTime.now());

        LocalTime open= LocalTime.of(6,0);
        LocalTime close=LocalTime.of(21,0);


        if(LocalTime.now().isAfter(open) == LocalTime.now().isBefore(close)){
            System.out.println("Store is open");
        }else{
            System.out.println("Store is close");

        }

        // print open,close, current time in this format
        //Store opens at 6:00 AM and closes at 9:00PM, and now is 12.35 PM
        //Store opens at 6:00 AM and closes at 9:00 PM and now is 12:43 PM
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("h:mm a");
        System.out.println("Store opens at" + formatter.format(open));
        System.out.println("Store opens at" + formatter.format(open).toLowerCase()+ " and close at" + formatter.format(close)+ "and now is" + formatter.format(LocalTime.now()));















    }
}
