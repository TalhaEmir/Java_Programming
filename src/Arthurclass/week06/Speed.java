package Arthurclass.week06;

public class Speed {

    public static void main(String[] args) {


        caughtSpeeding(65,true);
    }

    public static void caughtSpeeding(int speed, boolean isBirthday) {

        String result = "";
        int min = 60;
        int max = 80;

        if (isBirthday) {
            min += 5;
            max += 5;
        }

        if (speed <= min) {
            System.out.println("0");
        } else if (speed < max) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }

    }

}


