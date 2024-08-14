package MurodilSessions.WEEK05murodil;

public class replaceorremove {

    public static void main(String[] args) {

        String sentence = "Hi, my name is John, I am SDET student";
        System.out.println("sentence: " + sentence);

        System.out.println("+++++++++++++++++++++++++++");

        //change John to Mike

        sentence= sentence.replace("John","Mike");

        System.out.println("sentence = " + sentence);


        //change SDET to Java Developer

        sentence= sentence.replace("Sdet","Java developer");
        System.out.println("sentence = " + sentence);

        //remove all spaces
        sentence= sentence.replace(" ","");
        System.out.println("sentence = " + sentence);


        //clean up strings

        String str2="$$1.000+ ,, results, $$ with _Ads";
        str2=str2.replace("$","").replace(",","");










    }
}
