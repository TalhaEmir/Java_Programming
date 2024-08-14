package week04.DAY010;


import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFileswiththeScanner {


    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/week04/DAY010/Test.txt"));

        System.out.println(scan.next());





    }


}
