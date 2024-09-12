package Tekrar.Tekrar.Days.DAY15_GENEL.Day15;

public class TekrarContinueStatement {

    public static void main(String[] args) {


        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                continue;// yazdirmiyor es geciyor
            }

            System.out.println(i);


        }
    }
}
