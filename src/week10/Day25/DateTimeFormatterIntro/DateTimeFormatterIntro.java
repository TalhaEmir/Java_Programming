package week10.Day25.DateTimeFormatterIntro;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df=DateTimeFormatter.ofPattern("EEEE,MM/dd/y");

        LocalDate today= LocalDate.now();
        System.out.println(today);//2024-07-24
        System.out.println(today.format(df));//2024//just one y
        System.out.println(today.format(df));//202407// double MM/ also we can put ''/''
        System.out.println(today.format(df));//2024Jul // triple MMM
        System.out.println(today.format(df));//2024 July//y/ 4 MMMMM
        System.out.println(today.format(df));// 2024 July//24 //"y MMMM//dd"


        //example
        LocalDate lateToday= LocalDate.of(2022,7,1);
        System.out.println(lateToday);
        System.out.println(lateToday.format(df));//2022 July//01
        // if pattern dd and We have 2022 July 1 1 part gonna be seeem 01
        System.out.println(lateToday.format(df));//"y MMMM//dd,E"//2022 July//01,Fri
        //Friday,07/01/2022 /"EEEE,MM/dd/y"



        //We can swtich the pattern MMMMM//dd///y or MMMMM-dd-y

        DateTimeFormatter tf=DateTimeFormatter.ofPattern("H:m");

        LocalTime time1=LocalTime.of(7,5);
        System.out.println(time1.format(tf));//07:05 HH:mm/// regular one like this
        System.out.println(time1.format(tf));//7:5 H:m


        LocalTime time2=LocalTime.of(17,30);

        DateTimeFormatter tf1=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(time2.format(tf1));//05:30 -- 12 hours slices
        System.out.println(time2.format(tf1));//05:30 PM//"hh:mm a"

        //hour in a day == 0-23 H
        //hour in a 1-12= h

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/y  hh:mm   a");

        LocalDateTime time3=LocalDateTime.now();
        System.out.println(time3);//2024-07-24T13:20:32.539243600

        System.out.println(time3.format(dtf));//07/24/2024  01:20   PM

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("EEEE, MM/dd/y  hh:mm   a");
        System.out.println(time3.format(dtf1));//Wednesday, 07/24/2024  01:24   PM








    }
}
