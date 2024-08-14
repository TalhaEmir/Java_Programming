package Tekrar.Tekrar.Scanner.Tasks;
import java.util.Scanner;

public class CurrentSpeed {

    public static void main(String[] args) {
       /* Create a class named SpeedCheck and write a program for the speed check.
                A variable named speedLimit is declared and given
        ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
        speedLimit = 55;

        Enter current speed:
        105

        output:
        You're driving 50 mph over the limit. Slow down!*/

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your current speed");
        int currentSpeed=input.nextInt();
        int speedLimit=40;
        int overTheLimit=currentSpeed- speedLimit;


        if( overTheLimit>0 ){
            System.out.println("You're driving" + (overTheLimit) +"mph over the limit. Slow down!*" );
        }else if(overTheLimit<0 ){
            System.out.println("You're driving" + (overTheLimit) +"mph under the limit. Very good!*" );
        }else{
            System.out.println("you are good");
        }



    }
}
