package Tekrar.MURODILTEKRAR.week11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;


public class ShortestWord {
     /*
    Return the shortest word in sentence
    findShortestWord("I love programming") => "I"
    findShortestWord("Cydeo school") => "Cydeo"
    findShortestWord("hi") => "hi"
 */

    public static void main(String[] args) {


    }

    public static String[] findAllShortestWords(String sentence) {
        String[] arr = sentence.split(" ");
        int shortestLength = arr[0].length();
        for (String eachWord: arr) {
            if(eachWord.length()< shortestLength){
                shortestLength=eachWord.length();
            }
        }

        ArrayList<String>shortestList= new ArrayList<>();
        for (String eachWord: arr) {
            if(eachWord.length()== shortestLength){
                shortestList.add(eachWord);;
            }
        }
        return shortestList.toArray(new String[shortestList.size()]);

    }
}