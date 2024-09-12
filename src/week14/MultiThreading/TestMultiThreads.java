package week14.MultiThreading;

public class TestMultiThreads {

    public static void main(String[] args) {


        ThreadHelloWorld thread1= new ThreadHelloWorld(1);
        ThreadHelloWorld thread2= new ThreadHelloWorld(2);
        ThreadHelloWorld thread3= new ThreadHelloWorld(3);
        ThreadHelloWorld thread4= new ThreadHelloWorld(4);
        ThreadHelloWorld thread5= new ThreadHelloWorld(5);

/*
        thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();
        thread5.run();
*/
        thread1.start();
      thread2.start();
      thread3.start();
      thread4.start();
     thread5.start();

     //Evet, bu doğru. Kodunuzda thread1.start(), thread2.start(), thread3.start(), thread4.start(), ve thread5.start() çağrıları,
        // beş farklı thread'in neredeyse aynı anda çalışmaya başlamasına neden olur.
        // Ancak, her bir thread birbirinden bağımsız olarak çalışır ve tamamlanmak için diğer thread'lerin bitmesini beklemez.

/*Hello world 1from thread  4
Hello world 1from thread  5
Hello world 1from thread  3
Hello world 1from thread  1
Hello world 1from thread  2
Hello world 2from thread  5
Hello world 2from thread  4
Hello world 2from thread  3
Hello world 2from thread  1
Hello world 2from thread  2
Hello world 3from thread  1
Hello world 3from thread  4
Hello world 3from thread  3
Hello world 3from thread  5
Hello world 3from thread  2
Hello world 4from thread  1
Hello world 4from thread  3
Hello world 4from thread  5
Hello world 4from thread  4
Hello world 4from thread  2
Hello world 5from thread  4
Hello world 5from thread  5
Hello world 5from thread  2
Hello world 5from thread  3
Hello world 5from thread  1
*/ //everything print at teh same time knowns multithread


    }
}
