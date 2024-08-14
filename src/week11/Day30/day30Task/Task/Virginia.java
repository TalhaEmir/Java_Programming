package week11.Day30.day30Task.Task;

public class Virginia extends State{
    private double rateOfConservativePeople;

    private double rateOfRacistPeople;


    public Virginia(String politicalParty, String Governor, String senator, int population, double rateOfConservativePeople, double rafeOfRacistPeople) {
        super("VI", politicalParty, Governor, senator, population);
        setRateOfConservativePeople(rateOfConservativePeople);
        setRateOfRacistPeople(rateOfRacistPeople);
    }


    public double getRateOfConservativePeople() {
        return rateOfConservativePeople;
    }

    public void setRateOfConservativePeople(double rateOfConservativePeople) {
        this.rateOfConservativePeople = rateOfConservativePeople;
    }

    public double getRareOfRacistPeople() {
        return rateOfRacistPeople;
    }

    public void setRateOfRacistPeople(double rafeOfRacistPeople) {
        this.rateOfRacistPeople = rafeOfRacistPeople;
    }


    public void processingVisaProcess(){

        System.out.println(getName()+ " processing emigrant process so slow because " +rateOfRacistPeople + "try to make slow");
    }


}