package Tekrar.MURODILTEKRAR.week11;
/*
Return count of "hi" in str.
countHi("hihellohihi") => 3
countHi("abc hi bye") => 1
countHi("java") => 0
 */
public class ToCount {


    public static void main(String[] args) {



    }

    public static int countHi(String word, String anotherWord){

        word=word.toLowerCase();
        anotherWord = anotherWord.toLowerCase();

        int count=0;


        for(int i=0 ; i< word.length()- anotherWord.length() ; i++ ){
            String part=word.substring(i, anotherWord.length());
            if (part.equals(word)) {
                count++;
            }
        }
        return count;
        }








    }

