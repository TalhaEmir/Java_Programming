package Tekrar.Tekrar.Methods.Tasks;

public class Day {

    public static void main(String[] args) {


    }


    public static String day (int days){

        String dayName = switch (days) {
            case 1 ->"Monday";
            case 2 ->"Tuesday";
            case 3 ->"Wednesday";
            case 4 ->"Thursday";
            case 5 ->"Friday";
            case 6 ->"Saturday";
            case 7 ->"Sunday";
            default-> "InvalidDay";


        };
        return dayName;
       }

    public static String monthName (int months){

        String month = switch (months) {
            case 1 ->"January";
            case 2 ->"February";
            case 3 ->"March";
            case 4 ->"April";
            case 5 ->"May";
            case 6 ->"June";
            case 7 ->"July";
            case 8 ->"August";
            case 9 ->"September";
            case 10 ->"October";
            case 11->" November";
            case 12-> " December";
            default-> "InvalidDay";


        };
        return  month;
    }



}
