package Week05.day11.lessons;

public class StringMethods2 {

    public static void main(String[] args) {

      String sentence="I love Pyhton, Phyton is the best programming language, and Phyton is in high demand ";

      sentence=sentence.replace("Phyton", "Java");// all the matching one

      System.out.println(sentence);

        System.out.println("//================================================");

        String word="Java";

    // word= word.replace('a', 'e');//jeve

word.replace("a", "e");
        System.out.println(word);

        System.out.println("//================================================");


String sentence2="I love Java, Java is cool";


     // sentence2=sentence2.replace("Java","Phyton");


sentence2= sentence2.replaceFirst("Java","Phyton");


        System.out.println(sentence2);

String sentence3="Java is fun,Java is cool, Java is amazing";
     sentence3= sentence3.replaceFirst(", Java",", Phyton");

        System.out.println(sentence3);




    }
}
