package groupworkstrainin;

public class ternaryenhance {
    public static void main(String[] args) {


    int score=45;

     System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;");

    String result2 = (score >= 60 && score < 70) ? "Passed" :
            (score > 40) ? "Need to take main exam" :
                    "Failed";

        System.out.println(result2);

        System.out.println("===============================");


        int examResult=85;
        String grade=
                (examResult > 100 || examResult < 0) ? "Invalid" :
                    (examResult >= 90) ? "Congrats" :
                            (examResult >= 70 && score <= 85) ? "Cheers" :
                                    (examResult >= 60 && score <= 70) ? "Passed" : "Failed";


        System.out.println(grade);
















}

}
