package Tekrar.Tekrar.Scanner.Tasks;

import java.util.Scanner;



public class GradeReport {

    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Enter your score");//10
        int score=input.nextInt();
        char grade=0;

        if(score<100&&score>90 ){
            grade='A';

        }else if(score<90 && score >80){
            grade='B';
        }


        /*3. Create a class named GradeReport:
        2.1 Ask the user to enter the his/her score
        2.2 Print the grade of the student (A, B, C, D, F)
        2.3 If user enter invalid score (negative or more than 100) print invalid score*/
    }
}
