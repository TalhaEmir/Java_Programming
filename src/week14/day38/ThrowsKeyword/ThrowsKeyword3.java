package week14.day38.ThrowsKeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword3 {

    public static void main(String[] args) throws InterruptedException{


        method1();// burada InterruptedException var main metodla gideriliyor
       //method2();// FileNotFoundException yazmamiz lazim bunu kullanmak icin main metoda

    }

    public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000);
    }


    public static void method1()throws InterruptedException {
        System.out.println("Hello world");
        pauseFor5Seconds();
        System.out.println("Hello cydeo");

    }


    public static void method2()throws InterruptedException, FileNotFoundException {
        System.out.println("First Program Started");

        Thread.sleep(3000);

        System.out.println("First Program Ended");

        new FileInputStream("");

        Thread.sleep(5000);




    }
}
