package Bestexamples.groupworkstrainin.GroupWork07_15_2024;

public class Tasks {
    public static void main(String[] args) {

        result(1,2,'+');
        double brighton=result(3,3,'-');
        System.out.println(result(2,3,'+'));


        eligibleVote(22,true);
        System.out.println(ageGroups(25));


        /*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)
	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"
	        Ex:
	            calculate(10, 20, '+')
	        output:
	            10 + 20 = 30
 */



         /*

    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)
	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)
	        output:
	            You are eligible to vote

*/

/*
3. Create a method named ageGroup that can print the age group of the person
	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )
 */
    }

    public static double result(double a, double b, char c){

        if (c=='+'){
            return a+b;
        }else if (c=='-'){
            return a-b;
        }else if (c=='*'){
            return a*b;
        }else if (c=='/'){
            return a/b;
        }else {
            return 0;
        }





    }
    public static void eligibleVote(int age, boolean isAmerican){
        if ((age>=18 && age<=25)&& (isAmerican)){
            System.out.println("You are eligible to vote");
        } else if ((age<18 || age>125) &&!(isAmerican)) {
            System.out.println("You are not eligible to vote");

        }


        }


    public static String ageGroups(int value){
        if (value < 21) {
           return "ads";
        } else if (value>= 21 && value < 65) {
           return"asfwf";
        } else {
            System.out.println("invalid");
            return "invalid";
        }
    }


    }




