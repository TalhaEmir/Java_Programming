package week03.day05operators.LogicalOperators;

public class LogicalOperatorsOr {


    public static void main(String[] args) {

   // || either

        String answer= "maybe";

        boolean validAnswer= answer== "yes" || answer== "no";

        System.out.println(validAnswer);

        System.out.println("==================");

        char grade='B';

        boolean passedExams= grade=='B' || grade=='C' || grade=='D'|| grade=='E' || grade=='A';
        System.out.println(passedExams);

    }
}
