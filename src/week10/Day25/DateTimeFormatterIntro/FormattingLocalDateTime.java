package week10.Day25.DateTimeFormatterIntro;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FormattingLocalDateTime {

    public static void main(String[] args) {
        //LocalDateTime give everything together means it gave them together

        DateTimeFormatter df=DateTimeFormatter.ofPattern("EEE,MMM/d/y");

        LocalDateTime a= LocalDateTime.of(LocalDate.now(), LocalTime.now());


        System.out.println(a);

        System.out.println(df.format(a));





    }
}