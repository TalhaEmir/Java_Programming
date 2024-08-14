package week06.day15.LongVideo;

public class ContinueStatement {

    public static void main(String[] args) {


        for (int i = 1; i <=5; i++) {
            if (i == 3 || i==4) {// this skip just this value
                continue;
            }
            System.out.println(i);
        }
        System.out.println("============="); // every single number from ten to 20

        for (int i = 10; i <21; i++) {
             if (i%2==0) {
                 continue;

             }
            System.out.println(i);

        }
        System.out.println("==============================");

        for (char i= 'A'; i <= 'G'; i++) {

            if (i == 'B'|| i == 'E' ) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("==============================");

        for (int i=0; i<10; i++)
            System.out.println("hello world");
        System.out.println("hello cydeo");

    }
}
