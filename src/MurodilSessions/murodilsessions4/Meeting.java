package MurodilSessions.murodilsessions4;
import java.util.Scanner;
public class Meeting {
    public static void main(String[] args) {


        /*

        Meeting [Scanner keyboard input, concatenation]
    Code this flow:
    What is your name?
    Mike
    Nice to meet you Mike!
    ----
    How old are you?
    11
    11 - that's old!
         */

        Scanner input = new Scanner(System.in);
        //  String name= "John"; "John is hardcoded in the code"
        System.out.println("What is your name?");
       String name = input.next();// accepts string from scanner
        System.out.println("Nice to meet you, " + name);
        System.out.println("\n\n");
        System.out.println("How old are you");
        int age = input.nextInt();

        System.out.println(age + " years old");

        input.close();

    }
}
