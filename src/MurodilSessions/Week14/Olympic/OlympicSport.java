package MurodilSessions.Week14.Olympic;

public class OlympicSport {
    private String name;
    private int participants;
    public static final int YEAR_OF_FIRST_OLYMPICS = 1896;

    public OlympicSport(String name, int participants) {
        setName(name);
        setParticipants(participants);
    }

    public void compete() {
        System.out.println("competing in olympics for " + name);
    }

    @Override
    public String toString() {
        return "OlympicSport{" +
                "name='" + name + '\'' +
                ", participants=" + participants +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }
}

