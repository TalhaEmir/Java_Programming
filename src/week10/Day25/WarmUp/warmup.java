package week10.Day25.WarmUp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class warmup {

    public static void main(String[] args) {
/*
LocalDateTime: LocalDate + LocalTime




1. use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020

*/
/*
LocalDateTime: LocalDate + LocalTime




1. use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020

*/

        DateTimeFormatter dtf12=DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/d/y   ");
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/d/y   ");

        LocalDateTime specificDateTime=LocalDateTime.of(2020,11,24,1,00);

        DateTimeFormatter dayFormatter= DateTimeFormatter.ofPattern("EEEE");
        DateTimeFormatter  timeFormatter=DateTimeFormatter.ofPattern("h:mm a");
        DateTimeFormatter   dateFormatter=DateTimeFormatter.ofPattern("MMM/d/y");

        LocalTime hour=LocalTime.of(1,00);
        LocalDate day=LocalDate.of(2020,11,24);



       /* LocalDateTime hour=LocalDateTime.of(2020,11,24,13,0);


        System.out.println(hour.format(dtf1));
*/// benimki




    }
}
