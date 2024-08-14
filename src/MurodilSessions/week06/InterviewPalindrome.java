package MurodilSessions.week06;

public class InterviewPalindrome {

    public static void main(String[] args) {


        String word = "HIH";
        String reversed = "";


        //   for ( int i= 0; i< word.length(); i++){ // it is printing d 3 or 2 times
        //       System.out.println(word.charAt(i));
        //  }

        for (int i = word.length() - 1; i >= 0; i--) {
            //  System.out.println("i="+i);
            // System.out.println(word.charAt(i));
            reversed += word.charAt(i);//
            System.out.println(word.charAt(i));

        }
        System.out.println("reverse is: " + reversed);

        if (word.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }

    public static boolean isPalindrome(String word) {// true
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);


        }
        return word.equals(reversed);


    }



}
