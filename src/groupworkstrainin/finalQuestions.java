package groupworkstrainin;

public class finalQuestions {

    public static void main(String[] args) {
        /*
Create a class called FieldTrip. Your school goes on a Field trip each year.The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith

			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee

			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson

			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes

			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela

			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt

			        for any other gradeNumber:
			        	location - Unknown
			        	numer of gourps - 0
			        	teacher in charge - Unknown
cozumler
*/


        int grade=1;
        String location="0";
;        int numberOfGroup=0;
        String teacherInCharge="";

       switch (grade){
            case 1:
            location="Apple orchard";
            numberOfGroup=2;
            teacherInCharge="Yes";
            break;
            case 2:
                location="Apple orchard";
                numberOfGroup=3;
                teacherInCharge="No";
           default:
        }

        System.out.println(grade + "number of " + numberOfGroup + teacherInCharge );




    }
}
