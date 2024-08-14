package InterviewQuestions.Interview;

public class CountTheWords {

    public static void main(String[] args) {

        String str = "java JAva jaVa java JAVA";
        int count = 0;
        String word = "java";

        str= str.toLowerCase();

        while(str.contains(word)){

            count++;

            str = str.replaceFirst(word,"");
        }
        System.out.println(count);
    }
}

