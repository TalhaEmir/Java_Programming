package Tekrar.Tekrar.Days.Week3day6;

public class day07 {

    public static void main(String[] args) {

        /*1. Create a class called CrewAndPassenger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT*/


        int total=75;
        if(total==50 || total==75 ||total==100) {
            if (total == 50) {
                System.out.println("20 crew, 3 passangers");
            } else if (total == 75) {
                System.out.println("25 crew, 50 passangers");
            } else if (total == 100) {
                System.out.println("30 crew, 70 passangers");
            }

        }else {
            System.out.println("Any other number of people on the ship is not valid");
        }


    }

}
