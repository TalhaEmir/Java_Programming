package Tekrar.Tekrar.StringManipulation.Lesson;

public class ReplaceMethod {
    public static void main(String[] args) {
        String sentence="Python is cool, I love Python Programming";

        sentence=sentence.replace("Python","Java");
       sentence =sentence.replace('i','I');

        // you can give string and char

        System.out.println(sentence);//Java Is cool, I love Java ProgrammIng




    }
}
