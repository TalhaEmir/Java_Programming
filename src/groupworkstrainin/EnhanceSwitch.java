package groupworkstrainin;

public class EnhanceSwitch {
    public static void main(String[] args) {

        int month=5;

        switch (month) {
            case 1,2,4,5-> System.out.println("31 DAY");
            case 6,7-> System.out.println("30 days");
            case 8,9 -> System.out.println("31 days");
            case 10, 11 -> System.out.println("31 days");

        }

/*

Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			anything else: print "Invalid floor - 6"


 */


        int floorNumber=1;

        String result=switch (floorNumber){

            case 1 -> "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            case 2 -> "Floor 2 selected. Companies: Cydeo, NASA, Intelsat";
            case 3->"Floor 3 selected. Companies: Lyft, BofA, Stake house";
            default->"invalid";
        };
        System.out.println(result);










    }
}
