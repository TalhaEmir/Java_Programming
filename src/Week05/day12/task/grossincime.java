package Week05.day12.task;

public class grossincime {

    public static void main(String[] args) {


        /*7. Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0

            */

        vages(45.0, 40,0);

    }

    public static void vages(double hourlyRate,int  weeklyHours, double grossIncome){

        grossIncome= hourlyRate*  weeklyHours* 52;
        System.out.println("You make" + " $" +hourlyRate);
        System.out.println("You work " +  weeklyHours+ " hours in a week");
        System.out.println("Your gross income is " + "$" + grossIncome);
    }
}
