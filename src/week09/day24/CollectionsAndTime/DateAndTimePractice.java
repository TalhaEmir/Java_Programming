package week09.day24.CollectionsAndTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateAndTimePractice {

    public static void main(String[] args) {

        System.out.println("============LocalDateClass");
        //localDateClass
        // it gave us years, month, and days to numerically

        //now method
        LocalDate today=LocalDate.now();
        System.out.println("today "+ today);//2024-07-23

        // of() returns localDate object with specified years, months,and days


        LocalDate date1= LocalDate.of(2013,8,25);
        System.out.println(date1);

        System.out.println("==================================");


        DateTimeFormatter df=DateTimeFormatter.ofPattern("E,MMM/d/y");


        LocalDate date2=LocalDate.of(1999,7,5);// it is coming like int value
        System.out.println(date2);//2013-08-25
        System.out.println(df.format(date2));//Mon,Jul/5/1999















    }
}
