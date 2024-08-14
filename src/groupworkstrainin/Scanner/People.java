package groupworkstrainin.Scanner;

import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int n = input.nextInt();
        if (n<3){
            System.out.println("You have lived with less than 3 people.");
        } else if (n>=3 && n<=6) {
            System.out.println("You have lived with 3-6 people");

        }else {
            System.out.println("You have lived with 6 people");
        }
    }

}
