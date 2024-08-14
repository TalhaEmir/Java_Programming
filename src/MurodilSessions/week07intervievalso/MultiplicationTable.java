package MurodilSessions.week07intervievalso;

public class MultiplicationTable {

    public static void main(String[] args) {

        //for whole the numbers with ten


        for (int i = 1; i <= 10; i++) {// outer lope 1
                for (int j = 1; j <= 10; j++) { // 1 ,2 ....9
                    System.out.println(i + "x" + j + "=" + i*j);// 1x1=1 -  /*2=2 .... 1x9=9 yani icerdeki loop 9na kadar gidecek


                }

                // her zaman ilk olarak en icerdeki loop bitecek sonra ddigerine gececek

        }

        System.out.println("=========================");


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }


    }
}
