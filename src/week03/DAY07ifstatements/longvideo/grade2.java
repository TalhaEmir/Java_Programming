package week03.DAY07ifstatements.longvideo;

public class grade2 {

    public static void main(String[] args) {

        char grade = 'A';
        String result="";

        if (grade == 'A') {
            result = "succesfull";
        }else if (grade == 'B') {
            result = "good";
        }else if (grade == 'C') {
            result = "itsoks";
        }else if (grade == 'D') {
            result = "passed";

        }else if (grade == 'E') {
            result = "failed";
        }else{

        }

        System.out.println("result is = " + result);
        }
    }
