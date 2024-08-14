package Tekrar.Tekrar.Array.Task;

public class Scores {

    public static void main(String[] args) {
        String[] studentNames = {"Talha", "Emir", "Nevbahar"};
        int[] scores = {90, 75, 80};
        char[] grade = new char[studentNames.length];

        for (int i = 0; studentNames.length > i; i++) {
            if (scores[i] == 90) {
                grade[i] = 'A';
            } else if (scores[i] == 80) {
                grade[i] = 'B';
            } else if (scores[i] == 75) {
                grade[i] = 'C';
            }

            System.out.println(studentNames[i] + " 's each score is" + scores[i] + "and grade is " + grade[i]);
        }

    }
}


/*
   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

   2.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B


*/