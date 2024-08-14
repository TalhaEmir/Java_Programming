package Tekrar.Tekrar.Loops.Tasks;

public class DoubleAlphabets {

    public static void main(String[] args) {


        for(char each='A' ; each<='E' ; each++ ){
        for(char others='a'; others<='z' ; others++){
            System.out.print(each+""+others);
        }
            System.out.println();
        }
    }
}
