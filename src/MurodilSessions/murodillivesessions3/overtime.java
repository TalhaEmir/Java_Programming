package MurodilSessions.murodillivesessions3;

public class overtime {

    public static void main(String[] args) {


        /*


        Overtime [if else, operators, variables]

    Declare and assign the following variables
        hourly rate & number of hours worked

    Calculate your total net pay for the week. Also consider if any overtime should be paid.
     Overtime will be 1.5 times the normal rate and should be paid for every hour over 40.
    (if you worked 43 hours total, you will get 40 hours normal pay and 3 hours overtime pay)

    Output different messages based on overtime
        if normal hours were worked (40 hours or less):
            You worked $hours hours, so your total net pay is: $netPay

        if you worked overtime (more than 40 hours):
            Wow you worked $hours hours so you will get $overtime_hours of overtime. Your net pay is $netPay
         */


        double hourlyRATE= 50.0;
        int numberOfHours=35;
        double netPay;

        if(numberOfHours> 40){
            System.out.println("Overtime");
            int overtimeHours= numberOfHours-40;
            netPay= 40*hourlyRATE; //calculate regular first
            netPay += overtimeHours*hourlyRATE*1.5;
            System.out.println("Net Pay: "+netPay);




        }else{

            System.out.println("Regular");
            netPay= numberOfHours*hourlyRATE;
            System.out.println("Net Pay: "+netPay);

    }

}


}