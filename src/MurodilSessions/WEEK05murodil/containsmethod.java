package MurodilSessions.WEEK05murodil;

public class containsmethod {

    public static void main(String[] args) {


        String today="Today we are learning string manipulation";

        System.out.println(today.contains("a"));
        System.out.println(today.contains("java"));
        boolean found= today.contains("learn");
        System.out.println(found);

        String etsyTitle="wooden spoon - Etsy";

        if(etsyTitle.contains("wooden spoon")){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }

        //check if today we are learning "string" topic

        System.out.println(etsyTitle.indexOf("Etsy")>=0);

        System.out.println("================================");

        String str="Practice JAVA Every DAY";
        str=str.toLowerCase();

        if(str.contains("java")){ //if(str.toLowercase().contains("java"){
            System.out.println("java is present");

        }else {
            System.out.println("not java is present");
        }













    }
}
