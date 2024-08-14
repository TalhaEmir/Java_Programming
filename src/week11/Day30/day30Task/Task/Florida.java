package week11.Day30.day30Task.Task;

public class Florida extends State {
    public Florida( String politicalParty, String Governor, String senator, int population,
                   double rateOfStormyDays, int numberOfIguanas, boolean hasCrocodileAtYourGarden) {
        super("FL", politicalParty, Governor, senator, population);
        setRateOfStormyDays(rateOfStormyDays);
        setNumberOfIguanas(numberOfIguanas);
        setHasCrocodileAtYourGarden(hasCrocodileAtYourGarden);
    }

    private double rateOfStormyDays;
    private int numberOfIguanas;
    private boolean hasCrocodileAtYourGarden;

    public double getRateOfStormyDays() {
        return rateOfStormyDays;
    }

    public void setRateOfStormyDays(double rateOfStormyDays) {
        this.rateOfStormyDays = rateOfStormyDays;
    }

    public int getNumberOfIguanas() {
        return numberOfIguanas;
    }

    public void setNumberOfIguanas(int numberOfIguanas) {
        this.numberOfIguanas = numberOfIguanas;
    }

    public boolean isHasCrocodileAtYourGarden() {
        return hasCrocodileAtYourGarden;
    }

    public void setHasCrocodileAtYourGarden(boolean hasCrocodileAtYourGarden) {
        this.hasCrocodileAtYourGarden = hasCrocodileAtYourGarden;

    }



    public void delay() {
        System.out.println("Because of rate of stormy days and bad days such as" + rateOfStormyDays+ " so many flight is delaying");


    }


}