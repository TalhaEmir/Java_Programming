package Arthurclass.week06;

public class alarmClock {


    public static void main(String[] args) {

        alarmClock(1, false);
        System.out.println(alarmClock(0, false));


        //solution 1

        // boolean isWeekend= day==0 || day ==6;

        //if(vacation && isWeekend){
        //  return "off";
        // }else if(vacation && !isWeekend || !vacation && isWeekend){
        //   return "10:00";
        // }else{
        //   return "7:00";
        // }

        //Solution2


// boolean isWeekend= day==0 || day ==6;

        //if (isWeekend){
        // return vacation ? "off" : "10:00":
        // return vacation ?"10:00": "7:00":
        //}


    }

    public static String alarmClock(int day, boolean vacation) {


        if (day <= 6 && day >= 0) {

            boolean isWeekend = day == 0 || day == 6;
            if (vacation && isWeekend) {
                return "off";
            } else if (vacation && !isWeekend || !vacation && isWeekend) {
                return "10:00";
            } else {
                return "7:00";
            }


        }
        return " Invalid Day";


    }

}