package Tekrar.Tekrar.StringManipulation.Tasks;
import java.util.Scanner;

public class TipCalculator {
    /*
8. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

            Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

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
    Tip per person: 29.75
    */

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)");
        String split=input.nextLine();
        System.out.println("Enter number of People");
        int numberOfPeople=input.nextInt();
        System.out.println("Enter the check amount");
       double checkAmount=input.nextDouble();

        input.nextLine();

       System.out.println("  How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = input.nextLine().trim().toUpperCase();

     double TotalTip=0;

        switch (serviceQuality) {
            case "POOR" ->TotalTip = checkAmount * 0.05;
            case "FAIR" ->TotalTip = checkAmount * 0.10;
            case "GOOD" -> TotalTip = checkAmount * 0.15;
            case "GREAT" -> TotalTip = checkAmount * 0.20;
            case "EXCELLENT" -> TotalTip = checkAmount * 0.25;
            default -> {
                System.out.println("Invalid service quality entered");
                System.exit(0); // Geçersiz girdi durumunda programı sonlandır
            }
        }

        double totalPay = TotalTip + checkAmount;


        double totalPerPerson = split.equals("yes") ? totalPay / numberOfPeople : totalPay;
        double tipPerPerson = split.equals("yes") ?TotalTip/ numberOfPeople : TotalTip;

    }















    }


