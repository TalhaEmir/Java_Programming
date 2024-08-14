package Tekrar.Tekrar.Scanner.Lessons;
import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input.nextLine();
        System.out.println(word);
    }
}
