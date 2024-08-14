package week10.Day25.LocalTimeIntro;
import java.time.LocalTime;
public class LocalTimeIntro {

    public static void main(String[] args) {

//LocalTime class still immutable
        LocalTime starting_Time=LocalTime.of(10,30);

        System.out.println(starting_Time);

        LocalTime right_now= LocalTime.now();

        System.out.println(right_now);//14:17:48.555765500




        //LocalTime time1=LocalTime.of(26,61);// it is wrong can not be 61 can not be 26,
        LocalTime time1=LocalTime.of(23,59,59);
        System.out.println(time1);//23:59:59
        System.out.println("Plushours");
        LocalTime time2=LocalTime.of(23,59,59);
        time1=time2;

        time1= time1.plusHours(1);

        System.out.println(time1);//00:59:59


        System.out.println("PlusMinutes");

        time1= time1.plusMinutes(45);

        System.out.println(time1);//01:44:59

















    }
}
