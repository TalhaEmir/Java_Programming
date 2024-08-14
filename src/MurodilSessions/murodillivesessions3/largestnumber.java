package MurodilSessions.murodillivesessions3;

public class largestnumber {


    public static void main(String[] args) {

        int a = 10000;
        int b = 3;
        int c = 100;

        //check if a is greater than b and a is greater than c
        if (a > b && a > c) {
            System.out.println("a is the Biggest number " + a);
        }else if (b > c && b > a) {

            System.out.println("b is the Biggest number " + b);
        } else {
            System.out.println("c is the Biggest number " + c);
        }
    }

}
