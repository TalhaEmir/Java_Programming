package Week05.day11.shortvideos;

public class substring {

    public static void main(String[] args) {

        //creating subvalue you can do beginning and ending index or just beginning index

        String sentence="I love Java Programming Language";

        //index number at beginning and ending index method it in here ending index number gonna be one less

        String word= sentence.substring(7,10+1);

        System.out.println(word);

        String word2=sentence.substring(7);// "Java Programming Language"
        // begining index just it gives just from number we gave that till the end of sentence
        System.out.println(word2);


    }
}
