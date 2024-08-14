package week03.DAY07ifstatements.tasks;

public class chargradeifstatements {

    public static void main(String[] args) {
       /* Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
        'A': excellent
        'B': great job
        'C': good
        'D': passed
        'F': failed
        other wise: invalid
        */
char grade='F';

        String result= "";

        if(grade=='A'){
            result= "Excellent";
        }
        if (grade=='B'){

            result= "Great job";
        }

        if (grade=='C'){

            result= "Good";
        }
        if (grade=='D'){
            result= "passed";

        }
        if (grade=='F'){

            result= "failed";
        }

        System.out.println(result);
    }
}
