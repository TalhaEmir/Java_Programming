package MurodilSessions.Week11Review.static_review;

public class MedalResult {
    public String country;
    public int gold;
    public int silver;
    public int bronze;
    public int total;

    public MedalResult(String country, int gold, int silver, int bronze) {
        this.country = country;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        this.total = gold + silver + silver + bronze;
    }

    public String toString() {
        return"MedalResult{" +
                "country='" + country + '\'' +
                ", gold=" + gold +
                ", silver=" + silver +
                ", bronze=" + bronze +
                ", total=" + total +
                '}';
    }

    // for creating country and country's medals
}
