package groupworkstrainin;
import java.util.Scanner;

public class dogrusu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed limit:");
        int speedLimit = input.nextInt();

        System.out.println("Enter your current speed:");
        int currentSpeed = input.nextInt();

        int overTheLimit = currentSpeed - speedLimit;

        if (overTheLimit > 0) {
            System.out.println("You are driving " + overTheLimit + " mph over the limit. Slow down!");
        } else {
            System.out.println("You are driving within the speed limit.");
        }

        // No need to close Scanner since it's not critical in this small program
    }
}