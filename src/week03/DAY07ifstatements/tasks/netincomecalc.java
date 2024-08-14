package week03.DAY07ifstatements.tasks;

public class netincomecalc {
    public static void main(String[] args) {
/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax
 */
        int salary = 100000;
        double taxRate = 0.0;
        boolean isMarried = true;


        if (salary >= 130000) {
            taxRate = 0.35;
        }

        if (salary >= 100000 && salary < 130000) { // if the salary is between 100k to 138 k (excluded) then he tax rate should be 30%
            taxRate = 0.30;
        }
        if (salary >= 80000 && salary < 99999) { // if the salary is between 80k to 99k not excluded then he or she tax rate should be 25%
            taxRate = 0.25;

        }

        if (salary < 80000) { // if the salary is less than 80k not exluded then he or she pay 20%tax rate
            taxRate = 0.20;
        }

        if (isMarried) { // if the person is married
            taxRate -= 0.05; // tax is reduced by %5

        }
        double totalTax= salary *   taxRate;

        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salary = " + netIncome);

        /*


          ONLY one block gets executed

        StatementA: Condition1 is true

        StatementB: Condition1 MUST be false, ondition2 is true

        StatementC: Condition1 & Condition2 MUST be false, condtion3 is true

        StatementD: Condition1 & Condition2 & Condition3 must be false

If and else section is just for if there are two condition
         */




      

    }

}
    
   

