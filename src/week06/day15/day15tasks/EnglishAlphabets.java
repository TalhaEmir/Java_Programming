package week06.day15.day15tasks;

public class EnglishAlphabets {
    public static void main(String[] args) {


        for (int i = 'A'; i < 'Z'; i++) {
            System.err.print((char) i+" ");


        }


        for (int i = 'Z'; i >= 'A'; i--) {
            System.err.print((char) i+" ");
        }


        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.err.print(letter+" ");
        }



    }
}

