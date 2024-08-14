package MurodilSessions.murodillivesessions3;

public class PARKINGLOT {

    public static void main(String[] args) {

        int cars = 0;
        System.out.println("1 car came to parking");
        //add 1 to cars
        cars++;
        System.out.println("Cars in parking = " + cars);

        System.out.println("2 more cars came to parking");
        //add 1 to cars using + math operator
        cars = cars + 1; //cars is now 2
        ++cars; //add 1
        System.out.println("Cars in parking = " + cars); //3

        System.out.println("5 more cars came to parking");
        cars += 1; //add 1
        cars += 4; //add 4. same as cars = cars + 4

        System.out.println("Cars in parking = " + cars);

        System.out.println("3 cars left parking");
        --cars;
        cars--;
        cars -=1;

        System.out.println("Cars in parking = " + cars);

        cars -=2;

        System.out.println("2 more cars left parking");


        System.out.println("5 times more cars left parking");

        cars *=5; // cars= cars *5
        System.out.println("Cars in parking = " + cars);

        int waitingCars = cars % 10;
        System.out.println("Cars in parking = " + waitingCars);


    }




}
