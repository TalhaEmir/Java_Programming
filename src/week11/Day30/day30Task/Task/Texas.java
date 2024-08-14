package week11.Day30.day30Task.Task;

public class Texas extends State {
    public Texas(String politicalParty, String Governor, String senator, int population, double valueOfOil, String gunViolation) {
        super("TX ", politicalParty, Governor, senator, population);
        setValueOfOil(valueOfOil);
        setGunViolation(gunViolation);
    }

    private double valueOfOil;
    private String gunViolation;

    public double getValueOfOil() {
        return valueOfOil;
    }

    public void setValueOfOil(double valueOfOil) {
        this.valueOfOil = valueOfOil;
    }

    public String getGunViolation() {
        return gunViolation;
    }

    public void setGunViolation(String gunViolation) {
        this.gunViolation = gunViolation;
    }


    public void hateSpeech(){
        System.out.println(getGovernor() + " violate so much such as gun usage and hate speech. Rates are " +gunViolation + gunViolation );
    }
}
