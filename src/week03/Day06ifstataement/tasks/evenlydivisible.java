package week03.Day06ifstataement.tasks;

public class evenlydivisible {
//Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
//            Ex:
//                number = 65;
//
//            output:
//                65 is divisible by 2: false
//                65 is divisible by 3: false
//                65 is divisible by 5: true
//
//            Evenly Divisible ==> remainder is zero
    public static void main(String[] args) {

        int number= 65;
        boolean isDivisibleBy2= number %2 ==0;
        // if the remainder divided by 2 is equal to zero, then it's evenly divisible by 2
        boolean isDivisibleBy3= number %3==0;
        // If the remainder of number divided by 3 is equal to zero, then it's evenly divisible by 3
        boolean isDivisibleBy4= number %5==0;
        // if the remainder of number is divided by 5 is equal to zero. Then it is evenly divisible by 5



    }
}
