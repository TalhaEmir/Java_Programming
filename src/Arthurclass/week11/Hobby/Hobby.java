package Arthurclass.week11.Hobby;

public class Hobby {
    public String name; // instance var name
    public double annualCost;
    public boolean isOutDoor;
    public boolean requireOthers;
    public Hobby(String name){ // constr par name
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this.name = name;
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutDoor, boolean requireOthers) {
        this.name = name;
        this.annualCost = annualCost;
        this.isOutDoor = isOutDoor;
        this.requireOthers = requireOthers;
    }
    public void doIt(){
        System.out.println(name + " , " + annualCost + " , "+ isOutDoor + " , " + requireOthers);
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutDoor=" + isOutDoor +
                ", requireOthers=" + requireOthers +
                '}';
    }


}
