package MurodilSessions.Week11Review;
/*
Return count of "hi" in str.
countHi("hihellohihi") => 3
countHi("abc hi bye") => 1
countHi("java") => 0
 */

public class TO5CountHI {
    public static void main(String[] args) {
        System.out.println(countHi("hihellohihi"));
        System.out.println(countHi("abc hi bye"));

        System.out.println(countWords("is it is fun", "is"));
        System.out.println(countWords("ijava is java and java is fun", "java"));
        System.out.println(countWords("ijava is java and java is fun", "is"));

    }

    public static int countWords(String str, String word) {
        str = str.toLowerCase();
        word = word.toLowerCase();
        //return (str.length() - str.replace(word,"").length()) / word.length();
        int count = 0;

        for (int i = 0; i < str.length()- word.length(); i++) {
            String part = str.substring(i, i + word.length());
            if (part.equals(word)) {
                count++;
            }
        }
        return count;
    }

    //abc hi bye - 10. abc  bye - 8. (10-8) / 2 => 1
    public static int countHi(String str) {
        str = str.toLowerCase();
        if (!str.contains("hi")) {
            return 0;
        }
        //loop and check
        int lenA = str.length();
        int lenB = str.replace("hi","").length();

        int count = (lenA - lenB) / 2;
        return count;
    }
}
