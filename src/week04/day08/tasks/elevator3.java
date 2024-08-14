package week04.day08.tasks;

public class elevator3 {

    public static void main(String[] args) {


        /*....*/    int floorNumber = 15;

        String result= "Invalid floor";

        if (floorNumber >= 1 && floorNumber <= 3) {

            result = "Floor" + floorNumber+" is selected. Companies: ";

            if (floorNumber == 1) {
                result += "Lobby, Verizon, Starbucks";
            } else if (floorNumber == 2) {
               result += "Cydeo, Nasa, IntelSat";
            } else {
                result +="Lyft,Bofa,StakeHouse";

            }


        }
        System.out.println(result);

}


}