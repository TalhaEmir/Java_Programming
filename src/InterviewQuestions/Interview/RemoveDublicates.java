package InterviewQuestions.Interview;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str = "aabbbccccddddd";
        String result = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (!(result.contains("" + str.charAt(i)))) {

                result += str.charAt(i);
            }

        }
        System.out.println("result = " + result);



    }
}
