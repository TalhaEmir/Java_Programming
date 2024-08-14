package week04.day08.tasks;

public class elevator2 {

    public static void main(String[] args) {

       int floornumber=2;
        boolean isvalidfloors= floornumber==1 || floornumber==2 || floornumber==3;


        String floorInfo="";
        if(isvalidfloors){

            if(floornumber==1){
                floorInfo="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            }else if(floornumber==2){
                floorInfo="Floor 2 selected. Companies: Cydeo, NASA, Intelsat";
            }else if(floornumber==3){
                floorInfo="Floor 3 selected. Companies: Lyft, BofA, Stake house";


            }


        }else{

            floorInfo="Invalid floor - 6";
        }


        System.out.println(floorInfo);








    }









}
