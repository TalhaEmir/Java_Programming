package MurodilSessions.Week14.Exercise;


public class Gym {
    public static void main(String[] args) {
        Running running = new Running();
        running.perform();
        int calories = running.getCaloriesBurned(30);
        System.out.println("minutes = 30 , calories = " + calories);

        System.out.println("=================");

        Bench bench = new Bench();
        bench.perform();
        System.out.println(bench.getCaloriesBurned(20));
        bench.rackWeight();

        System.out.println("=====Using Polymorphism=====");
        /*
        Polymorphism: object is child type && variable reference type
        can be parent class or interface
         */


        Exercise ex1 = new Running();
        ex1.perform();

        Exercise ex2 = new Bench();
        ex2.perform();
        System.out.println(ex2.getCaloriesBurned(32));
        //ex2.rackWeight();Error Exercise does not have access

        Lyft lift = new Bench();
        lift.perform();
        System.out.println(lift.getCaloriesBurned(44));
        lift.rackWeight();
    }
}
