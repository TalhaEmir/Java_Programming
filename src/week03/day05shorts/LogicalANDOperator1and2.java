package week03.day05shorts;

public class LogicalANDOperator1and2 {

    public static void main(String[] args) {

       /*

write a program that can check if a person is eligible for a loan

loan requirements:

1.Credit score must be 650 or greater
2.Salary must be 40000 or greater

        */

        int salary= 75000;
        int creditScore= 620;
        boolean isEligible= creditScore >= 650 && salary >= 40000;

        System.out.println("is Eligible ="+ isEligible);

        /*

      An integer variable named month is given

      write a program that can check if the given month has 30 days in it

     months having 30 days in a year are:
     april(4)
     june(6)
     September(9)
     November(11)

         */

        int month= 9;
        boolean has30Days= month== 4||month== 6||month== 9|| month==11;
        System.out.println("has30Days = " + has30Days);


    }
}
