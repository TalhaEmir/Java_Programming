package WEEK13.Day34.WarmUp;

public class Garage {
    public static void main(String[] args) {

        Honda honda= new Honda("Civic","Silver",2014,65000);
        System.out.println(honda);

        honda.stop();
        honda.start();

        Audi audi= new Audi("Q8", "Brown",2020,100000);
        System.out.println(audi);


        audi.autoPark();
        audi.stop();
        audi.start();

    }
}
