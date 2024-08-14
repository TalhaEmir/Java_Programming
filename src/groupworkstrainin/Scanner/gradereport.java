package groupworkstrainin.Scanner;

import java.util.Scanner;

public class gradereport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = sc.nextInt();
        String grader = (score >100 || score<0 ) ? "Invalid Score":
                (score<= 100&& score>=90) ? "A" :
                (score <90 && score>80)?"B":
                (score<=80 && score>70)?"C":
                (score<=70 && score>60)?"D":
                (score<=60 && score>55)?"E":"You failed";

    }
}
