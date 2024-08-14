package week11.Day30.day30Task.Task;

public class VirginiaPerson extends Virginia{
    public VirginiaPerson( String politicalParty, String Governor, String senator, int population, double rateOfConservativePeople, double rafeOfRacistPeople, double burgerRate, String sizeOfArea) {
        super(politicalParty, Governor, senator, population, rateOfConservativePeople, rafeOfRacistPeople);
       setBurgerRate(burgerRate);
       setSizeOfArea(sizeOfArea);
    }

    private double burgerRate;
    private String sizeOfArea;

    public double getBurgerRate() {
        return burgerRate;
    }

    public void setBurgerRate(double burgerRate) {
        this.burgerRate = burgerRate;
    }

    public String getSizeOfArea() {
        return sizeOfArea;
    }

    public void setSizeOfArea(String sizeOfArea) {
        this.sizeOfArea = sizeOfArea;
    }

    public void eatingBurger(){
        System.out.println(getName() + "eating so much burger from " + getGovernor() );
    }
}
