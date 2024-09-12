package MurodilSessions.Week14.Language;

public class English implements Language{

    @Override
    public String hello() {
        return "Hello";
    }

    @Override
    public String bye() {
        return "Bye";
    }

    public void translate() {
        System.out.println("Translating to English");
    }
}
