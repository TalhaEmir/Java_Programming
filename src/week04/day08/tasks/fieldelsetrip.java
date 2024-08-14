package week04.day08.tasks;

public class fieldelsetrip {

    public static void main(String[] args) {


        int grade=1;
        String location="";
        int numberOfGroups=0;
        String teacherInCharge="";

        if(grade==1) {
            location = "Apple orchard";
            numberOfGroups = 3;
            teacherInCharge = "Ms. Smith";
        }else if(grade==2) {
            location = "Zoo";
            numberOfGroups = 7;
            teacherInCharge = "Ms. Lee";
        }else if(grade==3) {
            location = "Aquarium";
            numberOfGroups = 5;
            teacherInCharge = "Ms. Wilson";
        }else if(grade==4) {
            location = "Movie Theater";
            numberOfGroups = 2;
            teacherInCharge = "Ms. Reyes";
        } else if (grade==5) {
            location = "Ms. Museum";
            numberOfGroups = 5;
            teacherInCharge = "Msr. Lela";

        }else if(grade==6) {
            location = "Six Flags";
            numberOfGroups = 8;
            teacherInCharge = "Mr. Watt";
        }else{
            location = "Unknown";
            numberOfGroups = 0;
            teacherInCharge = "Unknown";
        }
        System.out.println("Location: " + location + "\nnumberOfGroups: " + numberOfGroups + "\nteacherInCharge: " + teacherInCharge);

    }
}
