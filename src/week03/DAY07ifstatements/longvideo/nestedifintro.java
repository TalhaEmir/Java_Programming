package week03.DAY07ifstatements.longvideo;



public class nestedifintro {

    public static void main(String[] args) {
        int score = -300;

        if (score >= 0 && score <= 100) {

            if (score >= 60) {
                System.out.println("passed");
            } else {

                System.out.println("failed");
            }
        } else {
            System.out.println("Invalid Score");
        }



        System.out.println("=====================");
        int age = -200; // 1-150
        if (age >= 0 && age <= 150) {
            if (age >= 21){

                System.out.println("Eligible");
            }else {
                System.out.println("Not Eligible");
            }
        }else{
            System.out.println("Invalid Age");

        }




        System.out.println("=====================");


        int day= 35;
        if (day >= 1 && day <= 7) {

            if (day == 1){
                System.out.println("Monday");
            }else if (day == 2){
                System.out.println("Tuesday");
            }else if (day == 3) {
                System.out.println("Wednesday");
            }else if (day == 4) {
                System.out.println("Thursday");
            }else if (day == 5) {
                System.out.println("Friday");
            }else if (day == 6) {
                System.out.println("Saturday");
            }else if (day == 7) {
                System.out.println("Sunday");
            }

        }else{ // if the precondition is failed
            System.out.println("Invalid Day");
        }




        /*
        if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("Saturday");
        }else if(day==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid Day");
        }


*/




    }

}


