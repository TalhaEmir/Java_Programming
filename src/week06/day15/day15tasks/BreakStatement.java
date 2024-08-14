package week06.day15.day15tasks;

public class BreakStatement {

    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            System.out.println(i);{//if i's values reaches 6
            if (i == 6)
                break; // bu bese kadar yazzdiriyor
            }
        }



        System.out.println("=============");


        for (char i = 'A'; i < 'Z'; i++) {
            if (i == 'J') {
                System.out.println(i);
                break; // bu j ye kadar yazdiriyor
            }

            System.out.println(i);

        }


        for(int a = 0; a < 10; a++) {
            if (a == 6) {
                System.out.println(a);
                break;

            }
            System.out.println(a);
        }


    }

}