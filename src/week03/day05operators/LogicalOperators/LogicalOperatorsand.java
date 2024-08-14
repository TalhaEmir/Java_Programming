package week03.day05operators.LogicalOperators;

public class LogicalOperatorsand {

    public static void main(String[] args) {

        //logical operators


        double salary= 90000;
        int creditscore= 650;
        int age= 25;
        boolean eligibleForlean= salary >= 30000 && creditscore>=650 && age>=18;



        System.out.println(eligibleForlean);


        System.out.println("-------------");


        age=18;
        String country="USA";
        boolean elegibileToVote= age>=18 && country=="USA";

}
}