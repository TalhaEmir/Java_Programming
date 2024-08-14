package week10.Day25.LocalTimeIntro;
import java.time.LocalTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingTime {
    public static void main(String[] args) {
//LocalTime class still immutable
        LocalTime starting_Time=LocalTime.of(10,30);

        System.out.println(starting_Time);

        LocalTime right_now= LocalTime.now();

        System.out.println(right_now);//14:17:48.555765500


        DateTimeFormatter df=DateTimeFormatter.ofPattern("h:m:a");

        LocalTime starting_Time1=LocalTime.of(10,30);
        System.out.println(df.format(starting_Time1));//10:30:AM


    }
}
