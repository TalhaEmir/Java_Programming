package MurodilSessions.murodillivesessions3;

public class secondstominutes {

    public static void main(String[] args) {

      /*  SecondsToMinutes [variables, remainder operator, concatenation]
        Declare and assign the following variables
        totalSeconds

        Declare minutes , calculate minutes in totalSeconds
        Declare seconds , calculate remaining seconds
        Display in this format:
        In 550 seconds - there are 9 minutes and 10 seconds

        */
        int totalSeconds =100 ;

        //DIVIDE BY 60 TO GET MINUTES
        int minutes= totalSeconds/60;
        // GET REMAINDER SECONDS
        int seconds = totalSeconds%60;

        System.out.println("In " + totalSeconds + " seconds- there are " + minutes +  " minutes and " + seconds + " seconds");





    }
}
