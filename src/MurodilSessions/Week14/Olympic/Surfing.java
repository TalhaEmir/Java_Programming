package MurodilSessions.Week14.Olympic;

public class Surfing extends OlympicSport {

    public Surfing(int participants) {
        super("Surfing", participants);
    }

    @Override
    public void compete() {
        super.compete();//parent version
        System.out.println("surfing the waves");
    }
}