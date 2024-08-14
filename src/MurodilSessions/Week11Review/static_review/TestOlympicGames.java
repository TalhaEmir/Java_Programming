package MurodilSessions.Week11Review.static_review;

import java.util.Arrays;

public class TestOlympicGames {
    public static void main(String[] args) {

//(olympicGames1.medalResultList nedeni su bu ozelligini cagiriyorsun bu kadar medalresult gold nasilsa



        System.out.println("================OlympicGames1===================");

      OlympicGames  olympicGames1= new  OlympicGames();//cunku statikler ne olursa olsun
        // bir kez yazdirir listeyi sen listeyi direk cagirmadikca

        //ikiside statik ozellik ayni sttaik ozellige sahip ne kadar cagririsan cagir bir kez yazdirir bir kez yazdirdin bitti
        // bir ke yazdirmada


        OlympicGames japan = new OlympicGames();

        System.out.println("================OlympicGames1Print===================");

        //System.out.println(olympicGames1);

        //System.out.println(olympicGames1.medalResultList);//MurodilSessions.Week11Review.static_review.OlympicGames@5f184fc6

        System.out.println("================Japan===================");


        System.out.println("================JapanPrint================");

        System.out.println(japan);//MurodilSessions.Week11Review.static_review.OlympicGames@3feba861

        System.out.println(japan.medalResultList);

        System.out.println("=========================================");

        System.out.println(OlympicGames.medalResultList);





        OlympicGames.medalResultList.add(new MedalResult("China", 16,11,9));
        OlympicGames.medalResultList.add(new MedalResult("Rsussian", 17,10,9));


        System.out.println(OlympicGames.medalResultList);//[MedalResult{country='China', gold=16, silver=11, bronze=9, total=47}, MedalResult{country='France', gold=16, silver=11, bronze=9, total=47}, MedalResult{country='United States', gold=11, silver=20, bronze=20, total=71}, MedalResult{country='Sweden', gold=11, silver=20, bronze=20, total=71}, MedalResult{country='Germany', gold=13, silver=10, bronze=15, total=48}, MedalResult{country='Japan', gold=14, silver=12, bronze=13, total=51}, MedalResult{country='Russia', gold=15, silver=9, bronze=12, total=45}, MedalResult{country='Australia', gold=10, silver=15, bronze=10, total=50}, MedalResult{country='Canada', gold=9, silver=14, bronze=11, total=48}, MedalResult{country='Italy', gold=8, silver=13, bronze=12, total=46}, MedalResult{country='Brazil', gold=7, silver=6, bronze=8, total=27}, MedalResult{country='South Korea', gold=6, silver=4, bronze=7, total=21}, MedalResult{country='Netherlands', gold=8, silver=5, bronze=6, total=24}, MedalResult{country='Spain', gold=7, silver=4, bronze=5, total=20}, MedalResult{country='India', gold=6, silver=6, bronze=7, total=25}, MedalResult{country='Turkey', gold=5, silver=4, bronze=3, total=16}, MedalResult{country='Mexico', gold=4, silver=5, bronze=6, total=20}, MedalResult{country='New Zealand', gold=3, silver=3, bronze=2, total=11}, MedalResult{country='Argentina', gold=2, silver=3, bronze=4, total=12}, MedalResult{country='South Africa', gold=1, silver=2, bronze=3, total=8}]
//[MedalResult{country='China', gold=16, silver=11, bronze=9, total=47}, MedalResult{country='France', gold=16, silver=11, bronze=9, total=47}, MedalResult{country='United States', gold=11, silver=20, bronze=20, total=71}, MedalResult{country='Sweden', gold=11, silver=20, bronze=20, total=71}, MedalResult{country='Germany', gold=13, silver=10, bronze=15, total=48}, MedalResult{country='Japan', gold=14, silver=12, bronze=13, total=51}, MedalResult{country='Russia', gold=15, silver=9, bronze=12, total=45}, MedalResult{country='Australia', gold=10, silver=15, bronze=10, total=50}, MedalResult{country='Canada', gold=9, silver=14, bronze=11, total=48}, MedalResult{country='Italy', gold=8, silver=13, bronze=12, total=46}, MedalResult{country='Brazil', gold=7, silver=6, bronze=8, total=27}, MedalResult{country='South Korea', gold=6, silver=4, bronze=7, total=21}, MedalResult{country='Netherlands', gold=8, silver=5, bronze=6, total=24}, MedalResult{country='Spain', gold=7, silver=4, bronze=5, total=20}, MedalResult{country='India', gold=6, silver=6, bronze=7, total=25}, MedalResult{country='Turkey', gold=5, silver=4, bronze=3, total=16}, MedalResult{country='Mexico', gold=4, silver=5, bronze=6, total=20}, MedalResult{country='New Zealand', gold=3, silver=3, bronze=2, total=11}, MedalResult{country='Argentina', gold=2, silver=3, bronze=4, total=12}, MedalResult{country='South Africa', gold=1, silver=2, bronze=3, total=8}, MedalResult{country='China', gold=16, silver=11, bronze=9, total=47}, MedalResult{country='Rsussian', gold=17, silver=10, bronze=9, total=46}]

        System.out.println("=================");

        OlympicGames.searchByTotalMedals(30);

        System.out.println("============Japonya=========");

        OlympicGames japonya= new OlympicGames();

        System.out.println(japonya.medalResultList);

        System.out.println("total count of medals = " + OlympicGames.totalMedals);
        OlympicGames.searchByCountry("Ireland");

        OlympicGames.addMedalResult("Ireland", 1, 1, 0);
        OlympicGames.searchByCountry("Ireland");


    }
}
