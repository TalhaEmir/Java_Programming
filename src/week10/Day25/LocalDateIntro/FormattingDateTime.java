package week10.Day25.LocalDateIntro;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class FormattingDateTime {

    public static void main(String[] args) {
        LocalDate date1= LocalDate.of(2013,8,25);
        System.out.println(date1);

        System.out.println("==================================");


        DateTimeFormatter df=DateTimeFormatter.ofPattern("E,MMM/d/y");


        LocalDate date2=LocalDate.of(1999,7,5);// it is coming like int value
        System.out.println(date2);//2013-08-25
        System.out.println(df.format(date2));//Mon,Jul/5/1999
    }
}
