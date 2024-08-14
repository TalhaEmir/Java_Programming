package Tekrar.Tekrar.StringManipulation.Lesson;

public class Substring {
    public static void main(String[] args) {
        String sentence="Python is cool, I love Python Programming";

        sentence.substring(7,10);// ending index nit included
        String word1=sentence.substring(7,10);

        System.out.println( word1);//is

        String word2=sentence.substring(7);

        System.out.println( word2);//is cool, I love Python Programming

    }
}
