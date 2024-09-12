package InterviewAndWeeklyArrayandArraylist.FirstWeek.Interview;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        getConsecutive(10);

    }


    public static void getConsecutive(int n){
        for(int i= 1 ; i<=n ; i ++){

            String result="";


           if(i%2==0){
               result += "codility";
           }


            if(i%3==0){
                result += "test";
            }


            if(i%5==0){
                result += "coders";
            }


            System.out.println(result.isEmpty() ? i : result );

        }


    }
}
