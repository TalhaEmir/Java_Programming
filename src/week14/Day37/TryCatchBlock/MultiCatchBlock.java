package week14.Day37.TryCatchBlock;

import Tekrar.Tekrar.Days.week10.Days25.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program1 Started");


        Car car = null;
        ;

        try {
            car.drive();// NulPointerException
        } catch (ArithmeticException e) {
            System.out.println("First Catch Block");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("Second Catch Block");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Third Catch Block");
            e.printStackTrace();

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Third Catch Block");

        }catch(RuntimeException e){
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }

        System.out.println("Program1 ended");




        System.out.println("===================================================");


        System.out.println("Program2 ended");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }





    }
}