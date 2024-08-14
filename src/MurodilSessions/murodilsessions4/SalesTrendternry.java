package MurodilSessions.murodilsessions4;

public class SalesTrendternry {
    public static void main(String[] args) {

        int soldYesterday=44;
        int soldToday=53;
        int salesTrend;
        
        
        salesTrend= (soldToday>soldYesterday)?1:-1;
        System.out.println("salesTrend = " + salesTrend);
    }
}
