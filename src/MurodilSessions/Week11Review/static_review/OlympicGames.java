package MurodilSessions.Week11Review.static_review;

import java.util.ArrayList;

public class OlympicGames {
public static ArrayList<MedalResult>medalResultList=new ArrayList<>();//-> just one of olimpic gaames for example if it more than one olimpic games gonna be instance
// why we did it static
public static int totalMedals;


//normal bir arrayliste ekleme
    //new MedalResult("South Africa", 1, 2, 3)
    //add Austria
    //ya sda static block ile

    static {// add all medals in static block
        addMedalResult(new MedalResult("China", 16, 11, 9));
        addMedalResult(new MedalResult("France", 16, 11, 9));
        addMedalResult(new MedalResult("United States", 11, 20, 20));
        addMedalResult(new MedalResult("Sweden", 11, 20, 20));
        addMedalResult(new MedalResult("Germany", 13, 10, 15));
        addMedalResult(new MedalResult("Japan", 14, 12, 13));
        addMedalResult(new MedalResult("Russia", 15, 9, 12));
        addMedalResult(new MedalResult("Australia", 10, 15, 10));
        addMedalResult(new MedalResult("Canada", 9, 14, 11));
        addMedalResult(new MedalResult("Italy", 8, 13, 12));
        // Diğer ülkeleri de benzer şekilde ekleyelim
        addMedalResult(new MedalResult("Brazil", 7, 6, 8));
        addMedalResult(new MedalResult("South Korea", 6, 4, 7));
        addMedalResult(new MedalResult("Netherlands", 8, 5, 6));
        addMedalResult(new MedalResult("Spain", 7, 4, 5));
        addMedalResult(new MedalResult("India", 6, 6, 7));
        addMedalResult(new MedalResult("Turkey", 5, 4, 3));
        addMedalResult(new MedalResult("Mexico", 4, 5, 6));
        addMedalResult(new MedalResult("New Zealand", 3, 3, 2));
        addMedalResult(new MedalResult("Argentina", 2, 3, 4));
        addMedalResult(new MedalResult("South Africa", 1, 2, 3));
        // Bu listeyi genişletebilirsiniz
        System.out.println(medalResultList);

        for (MedalResult eachResult : medalResultList) {
            totalMedals += eachResult.total; /*neden bunu ekledi buraya*/
        }
    }

    public static void addMedalResult(MedalResult medalResult) {//new MedalResult("South Africa", 1, 2, 3) bunun icin dimi ???
        medalResultList.add(medalResult);


    }

    public static void searchByCountry(String country) {// bunu anlamadim// MedalResult mr2 = new MedalResult("Canada", 3, 4, 7);
        for(MedalResult result : medalResultList) {
            if (result.country.equalsIgnoreCase(country)) {
                System.out.println(result);
                break;
            }
        }
    }

    public static void searchByTotalMedals(int total) {
        for(MedalResult each : medalResultList) {
            if (each.total >= total) {
                System.out.println(each);
            }
        }
    }

    public static void addMedalResult(String country, int gold, int silver, int bronze) {
        //search country and add all medals. then update totalMedals as well
    }
}
