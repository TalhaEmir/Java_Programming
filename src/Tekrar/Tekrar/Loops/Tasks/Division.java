package Tekrar.Tekrar.Loops.Tasks;

public class Division {
    public static void main(String[] args) {
        /*Create a class named DivideTwoNumbers and
write a program that can perform division of two numbers
without using the division (/) and multiplication (*) operators.
    }*/

        int bolunen=100;
        int bolen=6;
        int time=0;
        int remainder= bolunen;

        for(int i=6; bolen<=bolunen ; bolunen-=6){
                time++;
            remainder -=bolen;
        }

        System.out.println("100 6'ya" + time + "kez bolunuyor" + "kalan" +remainder);




    }
}