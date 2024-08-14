package Arthurclass.week11.Country;

public class TestCountry {

    public static void main(String[] args) {
        Country brazil = new Country("Brazil", 200, "South America");
        // static variables can be called with ClassName
        System.out.println(Country.worldPopulation);
        // System.out.println(brazil.worldPopulation);


        System.out.println("brazil.name = " + brazil.name);
        System.out.println("brazil.continentInstance = " + brazil.continentInstance);
        System.out.println("brazil.population = " + brazil.population);

        System.out.println(brazil.toString());
        System.out.println(brazil);
    }
}