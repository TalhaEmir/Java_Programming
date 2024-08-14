package MondayClass;

public class ElseIf {


    public static void main(String[] args) {
        int grade = 100;

        if (grade >= 0 && grade <= 100) {

            if (grade >= 95 && grade <= 100) {
                System.out.println("A+");
            } else if (grade <= 95 && grade >= 90) {
                System.out.println("A");
            } else if (grade <= 90 && grade >= 80) {
                System.out.println("B");
            } else if (grade <= 80 && grade >= 70) {
                System.out.println("C");
            } else if (grade <= 70 && grade >= 60) {
                System.out.println("D");
            } else if (grade <= 60 && grade >= 50) {
                System.out.println("F");
            }
        }else {
            System.out.println("Invalid grade");
        }


    }

}



