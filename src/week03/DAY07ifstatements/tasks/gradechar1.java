package week03.DAY07ifstatements.tasks;

public class gradechar1 {

    public static void main(String[] args) {

        /*

          /*
        Create a class named Grade, a char variable named grade is given.
        Write a program to print the following messages:
        'A': Excellent
        'B': Great job
        'C': Good
        'D': Passed
        'F': Failed
        Note: Do not use more than one print statement

         */

        char grade = 'A';
        boolean validGrade = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';
        String result = "";

        if (validGrade) {

            if (grade == 'A') {
                result = "Excellent";
            }else if (grade == 'B') {
                result = "Great Job";
            }else if (grade == 'C'){
                result = "Good";
            } else if (grade== 'D') {
                result= "Passed";
            }else{
                result = "Failed";
            }

        }else{
            System.out.println("Invalid grade");
        }
        System.out.println("The grade is " + result);


    }
}
