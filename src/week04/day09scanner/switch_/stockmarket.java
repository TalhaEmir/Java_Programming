package week04.day09scanner.switch_;

import java.util.Scanner;

public class stockmarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many total shares do you have?");
        int shares = input.nextInt();

        String result = "Invalid Number of shares";

        if (shares > 0) {
            System.out.println("How much is your total value in the stock market?");
            double totalValue = input.nextDouble();

            input.nextLine(); //before we use the next nextLine() method we need to capture the "Enter" that's left by the nextDouble

            System.out.println("Enter the name of the company that you have the most shares in");
            String companyName = input.nextLine();

            result = "Your total stock market holding is $" + totalValue + " which is made up of " + shares + ". "
                    + companyName + " is your company holdings.";

        }

        System.out.println(result);

        input.close();


    }
}