package week10.Day25.DateTimeFormatterIntro;
import java.time.LocalDateTime;


public class LocalDateTimeTogether {
    public static void main(String[] args) {

        //LocalTime class still immutable

        //LocalDateTime: LocalDate + LocalTime

        LocalDateTime starts=LocalDateTime.now();

        System.out.println(starts);

        LocalDateTime ends=LocalDateTime.of(2023,5,18,11,0);
        // we should give a acceptable numbers in here or valid

        System.out.println(ends);
        System.out.println(starts.getDayOfWeek());//WEDNESDAY
        System.out.println(starts.getHour());







    }
}
