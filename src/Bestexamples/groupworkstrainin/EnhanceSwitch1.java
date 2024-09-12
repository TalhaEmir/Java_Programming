package Bestexamples.groupworkstrainin;

public class EnhanceSwitch1 {

    public static void main(String[] args) {

        String bes="afdafaf";

        int month = 5;
        String days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31 days";
            case 4, 6, 9, 11 -> "30 days";
            case 2 -> "28 or 29 days"; // Şubat ayı için özel durum
            default -> "Invalid month";
        };

        System.out.println("Month " + month + " has " + days);

        int day = 3;
        String dateDtype=switch (day){
            case 1, 2, 3, 4, 5-> "31 days";
            case 6, 7-> "30 days";
            default -> "Invalid day";

        };
        System.out.println(dateDtype);


    }
}

