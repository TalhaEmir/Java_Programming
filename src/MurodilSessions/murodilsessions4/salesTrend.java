package MurodilSessions.murodilsessions4;

public class salesTrend {

    public static void main(String[] args) {

        /*
        SalesTrend [if else, ternary, comparison]

Given the integer variables soldYesterday and soldToday,
Write an if/else statement that compares the value of the
variables soldYesterday and soldToday,
and based upon that comparison assigns salesTrend the value -1 or 1.

1 represents the case where soldToday is equal or greater than soldYesterday.
-1 represents the case where soldToday is less than soldYesterday.

Ex:
 soldYesterday is 92, soldToday is 105
  Output:
    salesTrend = 1

 soldYesterday is 44, soldToday is 12
  Output:
    salesTrend = -1
         */

        int soldYesterday=44;
        int soldToday=53;
        int salesTrend;


        if (soldYesterday<soldToday){
            salesTrend=1;
        } else {
            salesTrend=-1;
        }
        System.out.println("salesTrend = " + salesTrend);
    }
}
