package week04.day09scanner.scanner;
import java.util.Scanner;

public class speedlimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a current speed: ");
        int speed = input.nextInt();
        int speedLimit = 65;
        if (speed> speedLimit) {
            System.out.println("You are driving 50 mph over the limit. Slow Down!");
        }else{
            System.out.println("You are driving under the limit.");
        }

    }






}
