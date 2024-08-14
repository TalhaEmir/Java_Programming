package week08.day21.Task;

public class StudentGrade {

    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[]grades=new char[names.length];

        for (int i = 0; i <names.length ;i++) {
                int eachScore=scores[i];
                char grade='F';
                if (eachScore>= 90) {
                    grade = 'A';
                }else if(eachScore>=80){
                    grade='B';
                } else if (eachScore>=70) {
                    grade='C';

                 }else if(eachScore>=60){
                    grade='D';
            }
                grades[i]=grade;
            System.out.println(names[i]+ "'s socre is" + eachScore+ " , and grade is" + grade);


        }


    }
}
