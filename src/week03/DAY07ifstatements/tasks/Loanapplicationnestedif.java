package week03.DAY07ifstatements.tasks;

public class Loanapplicationnestedif {

    public static void main(String[] args) {



       /* 3. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
        35% for salary of 130K or more
        30% for salary of 100K to 129k
        25% for salary of 80K to 99K
        20% for salary of 79K or less

        in addition:
        if the person is married, he/she will pay 5% less tax

        */

        double salary= 85000;
        double taxRate= 0;
        boolean isMarried= true;

        if(!isMarried){
            if(salary>=130000){
                taxRate= 0.35;
            }else if(salary>=100000 && salary<=129999){
                taxRate= 0.35;
            }else if(salary>=80000 && salary<=99999){
                taxRate= 0.25;
            }else{
                taxRate= 0.25;
            }

            double tax= salary*taxRate;
            double netSalary= salary-tax;
            System.out.println("Your total income is "+netSalary);
        }else {
            salary= salary* (taxRate-0.05);
            System.out.println("Your total income is "+salary);
        }










    }
}
