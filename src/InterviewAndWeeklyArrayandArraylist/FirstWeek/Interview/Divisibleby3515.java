package InterviewAndWeeklyArrayandArraylist.FirstWeek.Interview;

public class Divisibleby3515 {
    public static void main(String[] args) {


        int n=100;

        String by15="";
        String by5="";
        String by3="";



        for(int i=1; i<100; i++){
            if(i%15==0){
                by15+=i+"";
            }else if(i%5==0){
                by5+=i+"";
            }else if(i %3==0){
                by3+=i+"";
            }
        }

        System.out.println(by15+ " " +by5+ " " + by3 );
    }
}
