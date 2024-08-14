package week04.day09scanner.switch_;

public class ifelseandswitch {

    public static void main(String[] args) {
/*
Create a class called CrewAndPassenger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */

        int number = 75;
        if (number == 50 || number == 75 || number == 100) {

            switch (number) {

                case 50:
                    System.out.println("20 crew, 30 passengers");
                case 75:
                    System.out.println("25 crew, 50 passengers");
                case 100:
                    System.out.println("30 crew, 70 passengers");

            }

        } else {
            System.out.println("Invalid number");
        }


    }
}
