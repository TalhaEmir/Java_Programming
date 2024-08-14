package InterviewQuestions.ChallengingQuestions;

public class ClassmateReverse {

    public static void main(String[] args) {

        String[] classMates = {"Naile Ağaç", "Ibrahim Ağaç", "İsmail Kurt",
                "Emine Arslan", "Gülperi Umaç", "Türkan Yılmaz", "Rahime Hicri", "Ayse Isıl", "AysunDamar"};

        for (String each : classMates) {
            String reversed = "";
            for (int i = each.length()-1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }

    }
}
/*

6. Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.


10. Create a class named GroceryItems and write a program with the following specifications:
    10.1 Given the following array:
         String[][] items = {
             {"Apple", "Banana", "Grape", "Avocado"},
             {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
             {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
         };

    10.2 Print the following output: (add \t between two words)
         Apple    Banana   Grape    Avocado
         Paper Towels     Toilet Papers   Tissues    Diapers
         Coke   Fanta   Arizona Tea   Pepsi   Water

    10.3 Print the following output: (add \t between two words)
         Avocado   Grape    Banana    Apple
         Diapers   Tissues   Toilet Papers   Paper Towels
         Water    Pepsi    Arizona Tea    Fanta   Coke

    10.4 Print the following output: (add \t between two words)
         Coke   Fanta   Arizona Tea   Pepsi   Water
         Paper Towels     Toilet Papers   Tissues    Diapers
         Apple    Banana   Grape    Avocado






 */

