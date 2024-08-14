package week11.Day30.day30Task.Task;

public class California extends State {



    public California(String politicalParty, String Governor, String senator, int population, double rateOfCrime, double rateOfFire) {
        super( "CA", politicalParty, Governor, senator, population);
        setRateOfCrime(rateOfCrime);
        setRateOfFire(rateOfFire);
    }

    private double rateOfCrime;
    private double rateOfFire;



    public double getRateOfCrime() {
        return rateOfCrime;
    }

    public void setRateOfCrime(double rateOfCrime) {
        this.rateOfCrime = rateOfCrime;
    }

    public double getRateOfFire() {
        return rateOfFire;
    }

    public void setRateOfFire(double rateOfFire) {
        this.rateOfFire = rateOfFire;
    }


    public void collectingTax(){
        System.out.println(getName()+ " couldnt manage tax and crime rate also " +  rateOfFire + rateOfCrime + " make tax collecting so muck"  );
    }
}
