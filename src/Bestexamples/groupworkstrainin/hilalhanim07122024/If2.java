package Bestexamples.groupworkstrainin.hilalhanim07122024;
import java.util.Scanner;

public class If2 {

    public static void main(Homework[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Split or No Split(Yes or no)");
        String splitOrNo = input.next().toLowerCase();

        System.out.println("Enter the number of people");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount");
        double amount = input.nextDouble();


        System.out.println("How was the service quality");
        String service = input.next().toLowerCase();

        input.close();

        double totalTip=(service.equals("excellent"))? amount*0.25
                :(service.equals("great"))? amount *0.2
                :(service.equals("good"))? amount* 0.15
                :(service.equals("fair"))? amount* 0.1
                :amount* 0.05;


        double totalToPay=amount+totalTip;

        System.out.println("Number of people:  " + numberOfPeople);
        System.out.println("Total tip:  " + totalTip);
        System.out.println("Total to pay:  " + totalToPay);

        if (splitOrNo.equals("yes")) {
            System.out.println("Total per person: " + (totalToPay/numberOfPeople));
            System.out.println("Total tip: " + (totalTip/numberOfPeople));


        }























/*Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:

Split or No split (Yes or No),
Enter the number of people (number)
Enter the check amount (number)
Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75 bu soru persembe gunu sorumuz olsun
*/








    }



}
