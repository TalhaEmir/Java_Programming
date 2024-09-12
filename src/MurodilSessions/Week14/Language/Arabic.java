package MurodilSessions.Week14.Language;

public class Arabic implements Language{

    @Override
    public String hello() {
        return "Salam";
    }

    @Override
    public String bye() {
        return "ma’a as-salama";
    }
}
