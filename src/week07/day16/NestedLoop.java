package week07.day16;

public class NestedLoop {

    public static void main(String[] args) {
        for (int j = 1; j < 5; j++) { // j i yi bes kezx yazdircak
            for (int i = 1; i <= 10; i++) { // buradaki i kadar degil i
                // 10 a varincaya kadar yazdircak, her seferinde i 1 ya da kac verildiyse
                System.out.print("ag\t");
            }
            System.out.println();
        }


    }

}