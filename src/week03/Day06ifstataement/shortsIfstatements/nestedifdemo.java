package week03.Day06ifstataement.shortsIfstatements;

public class nestedifdemo {

    public static void main(String[] args) {

        int score = 185; //1-100

        if(score > 100 && score <= 1) {

            if (score >= 90) {
                System.out.println("You passed the exam ");
            } else {
                System.out.println("You failed the exam ");
            }


        }else {
            System.out.println("it is invalid score ");

        }














    }


}