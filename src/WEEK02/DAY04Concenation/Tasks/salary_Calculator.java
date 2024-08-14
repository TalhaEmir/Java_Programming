package WEEK02.DAY04Concenation.Tasks;

public class salary_Calculator {

    public static void main(String[] args) {

        /*

        Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

                output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560
         */

        double weeklyHours= 45, //implicit casting
                hourlyRate= 50,//implicit casting
                stateTaxRate=6,//implicit casting
                federalstateTax= 26,//implicit casting
                salaryBeforeTax= weeklyHours*hourlyRate*52,
                stateTax= salaryBeforeTax* stateTaxRate/100,
                federalTax= salaryBeforeTax * federalstateTax/100,
                totalTax= federalTax+stateTax,
                salaryAfterTax= salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: "+"$"+salaryBeforeTax+"\n\t"+"Federal tax is: $"+federalTax+"\n\t"+"State tax is: $"+stateTax+"\n\t"+"Total tax is: $"+totalTax+"\n\t\t"+"Net income is: $"+salaryAfterTax);










    }
}
