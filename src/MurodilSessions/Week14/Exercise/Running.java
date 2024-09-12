package MurodilSessions.Week14.Exercise;

public class Running  extends Exercise{
    @Override
    public void perform() {
        System.out.println("Running for cardio fitness");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 15;
    }
}
