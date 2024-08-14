package week03.Day06ifstataement.ifclauseday6;

public class gradelevel {

    public static void main(String[] args) {

        int gradeLevel= 2;
        String result="";

        if (gradeLevel<=5 && gradeLevel>=1){
            result="Elemantary School";

        }else if (gradeLevel>=6 && gradeLevel<=8){
            result="Mathematical School";

        }else if (gradeLevel>=9 && gradeLevel<=12){
        result="High School";

    }else if (gradeLevel>=13 && gradeLevel<=16){

            result="college";
        }

        System.out.println(result);
    }
}
