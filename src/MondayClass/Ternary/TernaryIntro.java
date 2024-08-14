package MondayClass.Ternary;

public class TernaryIntro {

    public static void main(String[] args) {


        // shorthand if and else
        // must return one of two or more possible values

        // variable= (condition) ? value1:value;

        // paranthesis no mandatory

            /*
            if (score >= 0 && score <= 100) {

                if (score >= 100) {
                    result = "You passed";
                } else {
                    result = "You failed";
                }
            }else {
                result="invalid score";
            }*/

        int score= 66;

        String solution;
        solution= (score>0 && score<=100)?
                (score>95 )?"Excellent":
                (score<95 || score>85)?"Perfect":
                (score>75 )?"Good":
               (score>65)?"Bad":
                (score>50)?"PreconditionPass": "Fail"
                :"Invalid";

        System.out.println(solution);

       /* System.out.println("=============================");
        String result;

        result=(score>95)?"Excellent":(score<95 && score>85)?"Perfect":
                (score>75 )?"Good":(score>65)?"Bad":(score>50)?"PreconditionPass":"Fail";*/














       /* String result2= (score>=60)?"You passed":"You failed";

        System.out.println(result2);


        System.out.println("=========================");

        //enhance ternary // conditions should be always before questions mark



        // signs should be equal

        String result3=(score>= 0& score<= 100)? (score>60)?"Passed":"failed":"Invalid";
        System.out.println(result3);



/* int score = 78;
        String grade;

        grade = (score >= 90) ? "A" :
                (score >= 80) ? "B" :
                (score >= 70) ? "C" :
                (score >= 60) ? "D" : "F";

        System.out.println("The letter grade is " + grade);*/




    }

}
