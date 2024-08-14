package Week05.day11.shortvideos;

public class replacefirst {

    public static void main(String[] args) {

 //replaceFirst method just change the first one it matched and return it is gonna new string

        String sentence="Phyton is cool, I love Phyton Programming";

        sentence=sentence.replaceFirst("Phyton","Java"); // it returns new string but first Phyton
        //Java is cool, I love Phyton Programming

        System.out.println(sentence);



    }
}
