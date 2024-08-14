package week03.day05operators.RelationalOperators;

public class RelationalOperators2Boulean {

    public static void main(String[] args) {

int a= 200;
int b=2000;

       System.out.println(a>b);

       int c=400;
       int d=4000;
       boolean cIsGreater=c>d;
       System.out.println(cIsGreater);


        System.out.println("-----------------");
       int score= 75;
       boolean passed= score>= 60;
        System.out.println(passed);

        System.out.println("-----------------");


        int age= 11;
        boolean eiligibleBuyAlcolhol= age >= 21;
        System.out.println(eiligibleBuyAlcolhol);

       boolean eligibleToVote= age>=18;
        System.out.println("-----------------");
        //1.tevellut score must be 22 or greater
       // 2.akil must be 17 or greater
        int tevellut= 18;
        int akil=21;
        boolean isEligibleforMarriage= tevellut>22 && akil>=18;
        System.out.println(isEligibleforMarriage);


        System.out.println("-----------------");

        //
        //1.megasakirt score must be 6.5 or greater
        // 2.nammaz must be 12 or greater
        double megasakirt= 5.5;
        int namaz= 7;

        boolean isEligibleForbeingSakirt= megasakirt>5 && namaz >7;
        System.out.println(isEligibleForbeingSakirt);

        System.out.println("-----------------");
        System.out.println("-----------------");

        System.out.println("-----------------");
        score= 48;
        boolean failed= score >= 60;
        System.out.println(failed);
        System.out.println("-----------------");

        System.out.println('b'>'a');


      //System.out.println("java"<="CH");// ><>=<= CAN ONLY BE FOR NUMBER





















    }
}
