package week09.day24.CollectionsAndTime;
import java.time.LocalDateTime;
public class DateAndTimePractice3 {

    public static void main(String[] args) {


        LocalDateTime dt1=LocalDateTime.now();


        System.out.println(dt1);//2024-07-22T18:59:46.504376400
        LocalDateTime dt2=LocalDateTime.of(1988,11,15,10,45);
        System.out.println(dt2);//1988-11-15T10:45

    }
}
