package Tekrar.Tekrar.StringManipulation.Lesson;

public class ContainsMethod {
    public static void main(String[] args) {
        String sentence="I love Java and Python programming Language";

        boolean hasJava=sentence.toLowerCase().contains("Java");//sentencei lowercase yapiyor sonra contains yapiyor
        System.out.println(hasJava);//true

    }
}
