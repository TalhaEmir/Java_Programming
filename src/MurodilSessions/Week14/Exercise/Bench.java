package MurodilSessions.Week14.Exercise;

public class Bench extends Lyft {


    public void perform() {
        System.out.println("Bench pressing weights");
    }


    public int getCaloriesBurned(int minutes) {
        return minutes * 5;
    }


    public void rackWeight() {
        System.out.println("Racking barbel");
    }
}
