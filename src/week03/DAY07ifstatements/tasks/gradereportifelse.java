package week03.DAY07ifstatements.tasks;

public class gradereportifelse {

    public static void main(String[] args) {

     /*   1. Create a class named GradeReport.java
        2. An integer variable named score is declared and given, Write a
        program that can print the grade of the student

        Ex:

        score = 95

        output:
        Your grade is A

        Note: Assume that the given score is between 0 ~ 100
*/

        int score= 85;
        String result= "Your grade is: ";

        if(score >= 80 && score <= 90){
            result += "A";
        }else if(score >= 70 && score < 80){
            result += "B";
        }else if(score >= 60 && score < 70){
            result += "C";
        }else if(score >= 50 && score < 60){
            result += "D";
        }else if(score >= 40 && score < 50){
            result += "E";

        }
        System.out.println("result = " + result);


    }
}
