package week10.Day25.LocalDateIntro;
import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        //LocalDate is immutable LocalMonth is immutable


        LocalDate today = LocalDate.now();
        System.out.println(today);//2024-07-23

        LocalDate birthday= LocalDate.of(2011,7,23);// daye 32 veremezsin invalid deger veremezsin
        System.out.println(birthday);//1994-05-26
        //Invalid date 'February 29' as '1999' is not a leap year


        System.out.println("=======getYear===============");

        System.out.println(today.getYear());//2024

        System.out.println("=======getMonth=============");

        System.out.println(today.getMonth());//JULY

        System.out.println("=====GETMonthValue===========");

        System.out.println(today.getMonthValue());//7

        System.out.println("==========getDayOfWeek======");

        System.out.println(today.getDayOfWeek());//TUESDAY

        System.out.println(birthday.getDayOfWeek());//SATURDAY

        System.out.println("==========getDayOfMonth======");

        System.out.println(birthday.getDayOfMonth());//23

        System.out.println("==========getDayOfYear======");

        System.out.println(birthday.getDayOfYear());//204

        System.out.println("==========addyear======");

        today.plusYears(1);

        System.out.println( today);//2024-07-23 because it is immutable

        //but
        System.out.println("==========plusyears======");
        today= today.plusYears(1);

        System.out.println( today);//2025-07-23 // right now it is changed


        LocalDate graduationDate= LocalDate.of(2025,6,11);

        graduationDate.plusYears(2);

        graduationDate= graduationDate.plusYears(2);


        System.out.println( graduationDate);//2027-06-11

        System.out.println("==========plusmonths======");

        graduationDate= graduationDate.plusMonths(4);


        System.out.println("==========plusdays======");

        System.out.println( graduationDate);//2027-10-11

        graduationDate= graduationDate.plusDays(100);

        System.out.println( graduationDate);//2028-01-19

        System.out.println("==========minusyears======");

        LocalDate yourBirthday= LocalDate.of(2005,4,11);



        LocalDate yourOlderBrother=yourBirthday.minusYears(2).minusMonths(3);

        System.out.println(yourOlderBrother);//2003-01-11
        System.out.println(yourBirthday);//2005-04-11

        LocalDate birthday1=LocalDate.of(1994,6,7);

        LocalDate birthday2=LocalDate.of(1994,6,7);


       boolean r1= birthday1.isEqual(birthday2);
        System.out.println(r1);//true
        System.out.println("=========isBefore======");

        LocalDate grad_Date=LocalDate.of(2023,1,1);
        System.out.println(grad_Date.isBefore(LocalDate.of(2022,12,31)));//false
        System.out.println("=========isAfter======");
        System.out.println(grad_Date.isAfter(LocalDate.of(2022,12,31)));//true

        System.out.println("=========isLeapYear======");

        System.out.println(LocalDate.of(2022,6,16 ).isLeapYear());//false

















































    }
}
