package week04.day08.TernaryIntro;

public class day_08ternaryIntro {

    public static void main(String[] args) {

        int score = 85;

        String result = "";

        if (score >= 60) {
            result = "Passed";
        } else {
            result = "Failed";
        }
        System.out.println(result);


        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;");

       String result2= (score>= 60)? "Passed" : "Failed";
       System.out.println(result2);

        System.out.println("===============================");


        int age=18;
        String r;
        if (age >= 21) {
            r = "Eligible";

        }else{
            r = "Not Eligible";
        }

        String result1= (age>=21) ? "Eligible" : "Not Eligible";
        System.out.println(result1);

    }

}