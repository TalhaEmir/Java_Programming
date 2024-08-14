package week06.Day14.tasks;

public class DaysiNMonth {

    public static void main(String[] args) {

        date(3);


    }

    public static String date(int n) {

        String month = "";

        if (n > 0 && n < 13) {

            month = (n == 1) ? "January" : (n == 2) ? ("February") : (n == 3) ? "March" : (n == 4) ? "April" : (n == 5) ? "May" :
                    (n == 6) ? "June" : (n == 7) ? "July" : (n == 8) ? ("August") : (n == 9) ? "September" : (n == 10) ? "October"
                            : (n == 11) ? "November" : "December";


            if (month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July")
                    || month.equals("December") || month.equals("August") || month.equals("September")) {

                System.out.println(month + " has 31 days");
            } else if (month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November")) {

                System.out.println(month + " has 30 days");
            } else if (month.equals("February")) {

                System.out.println(month + " has 28 or 29 days");

            } else {
                System.out.println(month + " invalid number");
            }
        }
        return month;

    }

}