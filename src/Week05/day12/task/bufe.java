package Week05.day12.task;

public class bufe {

    public static void main(String[] args) {

       time(1);
       time(2);
       time(3);




    }

    public static String time(int number){
        String day="";
        switch (number) {
            case 1:
                day = "Monday";
                break;
                case 2:
                    day = "Tuesday";
                    break;
                    case 3:
                        day = "Wednesday";
                        break;

        }
        return day;

        /*
Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
 */

    }

}
