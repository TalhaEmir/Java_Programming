package Tekrar.Days.Week3day6;

public class BooleanGrade {


    public static void main(String[] args) {
/*
2. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT*/

       char grade = 'A';

        if(grade == 'A'||grade == 'B'||grade == 'C'||grade == 'D'||grade == 'E'||grade == 'F'){


        if (grade == 'A') {
            System.out.println("excellent");
        }else if (grade == 'B') {
            System.out.println("great job");

        }else if (grade == 'C') {
            System.out.println("good");
        }else if (grade == 'D') {
            System.out.println("passed");
        }else if (grade == 'F') {
            System.out.println("failed");
        }
        }else {
            System.out.println("invalid grade");
        }




    }
}
