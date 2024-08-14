package InterviewQuestions.Interview;

public class CountTheLetters {
    public static void main(String[] args) {
        String str = "aaabbccccddddd";

        String letter = "d";

        int count = 0;

        while (str.contains(letter)) {
            count++;
            str = str.replaceFirst(letter, "");
        }
        System.out.println(count);



    }
}
