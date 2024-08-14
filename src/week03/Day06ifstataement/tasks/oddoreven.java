package week03.Day06ifstataement.tasks;

public class oddoreven {
    public static void main(String[] args) {


        // Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
        //			Ex:
        //				number = 20
        //
        //			output:
        //				20 is an even number: true
        //				20 is an odd number: false
        //
        //		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)


        int number = 20;
        boolean isEven = number % 2 == 0;// when we divide a number by 2 if the  remainder is 0
        boolean isOdd = number % 2 != 0; //when we divide a number by 2 if the  remainder is not 0 means the number is odd
        //Another explanation   boolean isOdd= !isEven // If the number is not even, then it is odd
        System.out.println("20 is even number:" + isEven);
        System.out.println("20 is odd number:" + isOdd);



        System.out.println("---------------------");


        int number1= 65;
        boolean evenlydivisible1= number1 % 2 == 0;
        boolean evenlydivisible2= number1 % 3 ==0;
        boolean evenlydivisible3= number1 % 5 ==0;
        System.out.println("65 is divisible by 2: " + evenlydivisible1);
        System.out.println("65 is divisible by 3: " + evenlydivisible2);
        System.out.println("65 is divisible by 5: " + evenlydivisible3);


    }


}
