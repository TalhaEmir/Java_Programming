package week14.MultiThreading;

public class ThreadHelloWorld extends Thread {

    int threadNumber;

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i=1; i< 6 ; i++){
            System.out.println("Hello world " + i + "from thread  " + threadNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }


    // Thread Class==> if this class not extend other class
        // Runnable Interface ==> if this class extend other class Runnble Interface

    }

