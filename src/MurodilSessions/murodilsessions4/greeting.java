package MurodilSessions.murodilsessions4;
import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        /*
        Greeting [Scanner, multi-branch if, logical operators]
    capture keyboard input for integer variable hour, write conditional statements to print out matching greeting.
        hour 5 - 11 => Good morning
        hour 12 - 17 => Good afternoon
        hour 18 - 23 or 0 - 5 => Good evening
        Any other hour => Invalid hour
         */


        Scanner in = new Scanner(System.in);
        System.out.println("What is the hour");
        int hours = in.nextInt();

        if (hours >= 5 && hours <= 11) {
            System.out.println("Good Morning");
        }else if (hours >= 12 && hours <= 17) {
            System.out.println("Good Afternoon");
        }else if (hours >= 18 && hours <= 23 || hours >= 0 || hours <= 5) {
            System.out.println("Good Evening");
        }else {
            System.out.println("Invalid Hour");
        }




    }



    }
