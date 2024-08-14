package MurodilSessions.WEEK05murodil;

public class EXTRACTVALUES {

    public static void main(String[] args) {


        String str1="Address=100 Main St";

        System.out.println(str1.indexOf("="));
        int idx=str1.indexOf("Main");
        System.out.println("idx of Main="+idx);//12

        String stAddress=str1.substring(str1.indexOf("=")+1);
        System.out.println(stAddress);
        System.out.println("Address="+stAddress);


        String str2="city:New York";


        int startIndexOfCity=str2.indexOf(":" + 1 );
        String city=str2.substring(str2.indexOf(" ")+1);
        System.out.println(city);

        System.out.println(city);

        System.out.println("=========================");


        String etsyResult="949 results, with Ads";
        String numberOfResult= etsyResult.substring(0,etsyResult.indexOf(" "));
        System.out.println(numberOfResult);





    }
}
