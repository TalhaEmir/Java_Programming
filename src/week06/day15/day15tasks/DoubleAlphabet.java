package week06.day15.day15tasks;

public class DoubleAlphabet {

    public static void main(String[] args) {

String result="";
        for (char outer = 'A'; outer <= 'E'; outer++) {
            for (char inner = 'a'; inner < 'z'; inner++) {
                System.out.print(outer+""+inner +" ");
        }
            System.out.println();

        }


    }
}
