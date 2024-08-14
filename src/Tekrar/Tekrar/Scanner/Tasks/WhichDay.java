package Tekrar.Tekrar.Scanner.Tasks;
import java.util.Scanner;

public class WhichDay {

    public static void main(String[] args) {


            Scanner input= new Scanner(System.in);
            System.out.println("What is the Day");
            String day=input.nextLine();

            String topic="";
            String instructor="";

            switch(day) {
                case "Monday", "Tuesday" -> {


                topic = " Softskills ";
                instructor = " Muhtar ";
            }

                case  "Wednesday"->{
                    topic=" Java, Java Live Labs ";
                    instructor="Asiya, Mentor";
                }
                case "Thursday"->{
                topic= " Java, Java Live Labs ";
                instructor="Muhtar, Arthur, Zulpikar";

            }

                case "Friday"->{
                    topic= " Review day ";
                    instructor="Self study";

                }

                case "Saturday "->{
                    topic= " day off ";
                    instructor="None";
                }



            }



        System.out.println(day+topic+instructor);


    }

    /*
Schedule [scanner, switch statement]
    Ask the user to enter which day it is
    print which class we have on that day, and instructors
    Monday,Tuesday -> topic is "java", instructors is "Muhtar"
    Wednesday -> topic is "Softskills, Mentor meeting", instructors is "Asiya, Mentor"
    Thursday -> topic is "Java, Java Live Labs" , instructors is "Muhtar, Arthur, Zulpikar"
    Friday -> topic is "Review day", instructors is "Self study"
    Saturday -> topic is "Live review", instructors is "Asiya, Murodil"
    Sunday -> topic is "day off", instructor is "None"
    Otherwise "invalid day"
 */
}
