package Tekrar.Tekrar.StringManipulation.Lesson;

public class ReplaceFirst {

    public static void main(String[] args) {
        String sentence="Python is cool, I love Python Programming";

        sentence=sentence.replaceFirst("Python", "Java");// java is cool I love Phyton Programming

        System.out.println(sentence);//Java is cool, I love Python Programming

    }
}
