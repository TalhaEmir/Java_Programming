package Week05.day12.task;

public class dayandmonth {

    public static void main(String[] args) {

        numberofDays("June");
        numberofDays("July");

    }



    /*//1, 3, 5, 7, 8, 10, 12
//4, 6, 9, 11
/*
5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */


    public static String numberofDays(String month) {
        month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();

        String result = month + " has ";

        switch (month) {
            case "February":
                result += 28 + " days";
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                result += 30 + " days";
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                result += 31 + " days";
                break;
            default:
                result = "Invalid month";
        }

        System.out.println(result);
        return result;

    }

}