package Tekrar.Tekrar.StringManipulation.Lesson;

public class RepeatMethod {

    public static void main(String[] args) {
        String sentence="Java";
        String result1=sentence.repeat(4);//
        String result=sentence.concat(" ").repeat(4);
        System.out.println(result1);//JavaJavaJavaJava

        System.out.println(result);//Java Java Java Java




    }
}
