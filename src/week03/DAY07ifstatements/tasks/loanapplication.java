package week03.DAY07ifstatements.tasks;

public class loanapplication {
    public static void main(String[] args) {
        /*Create a class named LoanApplication.
        two variables named salary and createdScore are declared and given, write a program that can check if the person is eligible to apply for a loan
Note:In order to be eligible for a loan:
        1. salary: at least 45K
                    2. credit score: at least 700

 */
        int salary= 55000,
                creditScore= 680;

        String result= "";
        if (salary>=45000 && creditScore>=700) { // if should both of them together &&

            result = " You are eligible for the loan";
        }else{

            result = "You are not eligible for the loan";

        }

        System.out.println(result);
    }
}

