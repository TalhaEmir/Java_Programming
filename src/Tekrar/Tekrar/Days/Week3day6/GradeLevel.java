package Tekrar.Tekrar.Days.Week3day6;

public class GradeLevel {
    public static void main(String[] args) {


        /*Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
         grade level and types are:
                 1-5: Elementary school
                 6-8: Middle school
                 9-12: High school
                 13-16: College
                 17-18: Grad School
                 For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT*/

        int age=18;
        String result="";

        if(age>0 && age<=18){
            if(age>=1 && age<=5){
                result="Elemantary School";
            }else if(age>=6 && age<=8){
                result="Middle School";
            } else if (age >= 13 && age<=16) {
                result="College";
            } else if (age>=17 && age<=18) {
                result="Grad School";
            }
        }else{
            result="Invalid grade level given";
        }
        System.out.println(result);

    }
}
