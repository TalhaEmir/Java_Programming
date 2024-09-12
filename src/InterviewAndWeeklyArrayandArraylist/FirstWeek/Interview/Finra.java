package InterviewAndWeeklyArrayandArraylist.FirstWeek.Interview;

public class Finra {

    public static void main(String[] args) {

        getFinra(30);

        System.out.println("=================================");


        getFinra2(30);


    }



    public static void getFinra(int n) {

        for (int i = 1; i <= n; i++) {
            String result = "";


            if (i % 3 == 0) {
                result += "FIN";
            }


            if (i % 5 == 0) {
                result += "RA";
            }
            System.out.println(result.isEmpty()? i: result);
        }



    }

    public static void getFinra2(int n) {


        for (int i = 1; i <= n; i++) {

            String str="";

            if (i % 3 == 0) {
                str += "FIN";
            }


            if (i % 5 == 0) {
                str += "RA";
            }
            System.out.println(str.isEmpty()? i: str);




        }
    }


    }
