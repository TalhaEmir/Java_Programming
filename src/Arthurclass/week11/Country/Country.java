package Arthurclass.week11.Country;

public class Country {
    // static variables - that belongs to class
    public static double worldPopulation;
    public static double worldCO2Level;
    public static String continentStatic;
    // instance variables - that belongs to object

    public String name;
    public double population;
    public String continentInstance;

    static {
        continentStatic = "North America";
        worldPopulation = 7.88;
        worldCO2Level = 417.83;
    }

    public Country(String name, double population, String continentInstance) {
        this.name = name;
        this.population = population;
        this.continentInstance = continentInstance;
    }
}