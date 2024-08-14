package week11.Day30.day30Task.Task;

public class Test {
    public static void main(String[] args) {

       California sanFransisco=new California( "Republicans","Mustafa Abi","Serra Abla",100000000,10.5,23.5);
        Florida miami= new Florida("Democrats","Goksu","Mahmut",1000000000,78.9,100000,true);
        Virginia fortLauderLale=new Virginia("Republicans","Deebah","Me",100000,42.05,53.5);
        Texas dallas=new Texas("Republicans","Trump","Ivanka",10000,27278198,"A lots of");
        VirginiaPerson me= new VirginiaPerson("George","hakan","sezer",3223523,43.5,344,5435,"Large");



        System.out.println(sanFransisco);
        System.out.println(miami);
        System.out.println(fortLauderLale);
        System.out.println(dallas);

        sanFransisco.collectingTax();
        dallas.hateSpeech();
        me.eatingBurger();








    }
}
