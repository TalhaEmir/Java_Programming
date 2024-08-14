package MurodilSessions.WEEK05murodil;

public class ReverseShortString {

    public static void main(String[] args) {

        /*


        "abcd" --> dcba

        "java"--> "avaj"

         */

        String word="abcd";
        String reverse=""+word.charAt(3)+ word.charAt(2)+ word.charAt(1)+ word.charAt(0);

        System.out.println("word="+ word);
        System.out.println("reverse="+ reverse);



    }
}
