package week03.DAY07ifstatements.tasks;

public class loanaplicationtask1 {

    public static void main(String[] args) {



       /*
        I
        Warmup Tasks:
        1. Create a class named LoanApplication. two variables named salary and createdScore are declared and given,
         write a program that can check if the person is eligible to apply for a loan
        Note:In order to be eligible for a loan:
        1. salary: at least 45K
        2. credit score: at least 700


        */

        int salary = 50000;
        int creditScore = 790;

        String result = "";


        if (salary >= 45000 && creditScore >= 700) {
            result = "In order to be eligible for a loan:";
        } else {

            System.out.println("You are not eligible to for a loan");


        }

        System.out.println(result);

    }

}





