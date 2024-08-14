package week03.Day06ifstataement.ifclauseday6;

public class deneme {


    public static void main(String[] args) {

        int grade= 222;

        String location;
        int numOfGroups;
        String teacher;

        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                location = "Apple orchard";
                numOfGroups = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numOfGroups = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numOfGroups = 5;
                teacher = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Movie theater";
                numOfGroups = 2;
                teacher = "Ms. Reyes";
            } else if (grade == 5) {
                location = "Museum";
                numOfGroups = 5;
                teacher = "Ms. Lela";
            } else { // grade == 6
                location = "Six Flags";
                numOfGroups = 6;
                teacher = "Mr. Watt";
            }
        } else {
            location = "Unknown";
            numOfGroups = 0;
            teacher = "Unknown";
        }

        System.out.println("Location - " + location);
        System.out.println("Number of groups - " + numOfGroups);
        System.out.println("Teacher in charge - " + teacher);
    }
}
