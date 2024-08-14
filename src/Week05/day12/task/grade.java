package Week05.day12.task;

public class grade {

    public static void main(String[] args) {


        printGrade(78);


       printGrade(54);


       printGrade(44);


        printGrade(98);





    }


    public static void printGrade(int grade) {

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