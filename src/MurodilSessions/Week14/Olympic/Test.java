package MurodilSessions.Week14.Olympic;

public class Test {
    public static void main(String[] args) {
        OlympicSport olympicSport = new OlympicSport("Swimming", 55);
        System.out.println(olympicSport);
        olympicSport.compete();
        System.out.println("======================");

        Surfing surfing = new Surfing(34);
        System.out.println(surfing);
        surfing.compete();
        System.out.println("======================");

        Track track = new Track(32);
        System.out.println(track);
        track.compete();
        System.out.println("======================");

        Soccer soccer = new Soccer(66);
        System.out.println(soccer);
        soccer.compete();

        System.out.println("======================");

        System.out.println(OlympicSport.YEAR_OF_FIRST_OLYMPICS);
        System.out.println(Surfing.YEAR_OF_FIRST_OLYMPICS);
        System.out.println(Track.YEAR_OF_FIRST_OLYMPICS);
        System.out.println(Soccer.YEAR_OF_FIRST_OLYMPICS);
    }
}

