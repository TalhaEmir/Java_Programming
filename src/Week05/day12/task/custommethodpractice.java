package Week05.day12.task;

public class custommethodpractice {


    public static void main(String[] args) {
        buyAlcohol(2300);
        score(85);


/*int num1=100;
        oodOrEven(num1);
        */

    }


    public static void buyAlcohol(int eligible) {

        if (eligible >= 18) {
            System.out.println(" You can buy alcohol");
        } else {
            System.out.println(" You cannot buy alcohol");
        }


    }


    public static void score(int grade) {

        if (grade >= 90) {
            System.out.println("Your score is A");
        } else if (grade >= 80) {
            System.out.println("Your score is B");
        } else if (grade >= 70) {
            System.out.println("Your score is C");
        } else if (grade >= 60) {
            System.out.println("Your score is D");
        } else if (grade >= 50) {
            System.out.println("Your score is E");
        } else {
            System.out.println("You failed");
        }








    }




}
