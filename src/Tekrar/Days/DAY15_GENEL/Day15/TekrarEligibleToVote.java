package Tekrar.Days.DAY15_GENEL.Day15;

import java.util.Scanner;

public class TekrarEligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your age");
        int age = input.nextInt();// valid age 1-120

            while(!(age>120 && age>1)){
                System.out.println("Invalid Age. Please re Enter your age");
                age = input.nextInt();
            }

        System.out.println("Are you a US citizen? Yes/No");
        String yesOrNo = input.next().toLowerCase();

        while(!(yesOrNo.equals("yes") || yesOrNo.equals("no"))){
            System.out.println("Please re enter your citizenship answer yes or no");
            yesOrNo = input.next().toLowerCase();

            if(age >21 && yesOrNo.equals("yes")){
                System.out.println("You are eligilbe to vote");
            }else{
                System.out.println("You are not eligilbe to vote");
            }
        }
    }
}
