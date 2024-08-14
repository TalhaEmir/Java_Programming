package Week05.day12.task;

public class howmanydays {

    public static void main(String[] args) {


    }


    public static void daylight( String month){

        String monthName=month.toLowerCase();
        switch(month){
            case"January":
            case"March":
            case"May":
            case"July":
            case"August":
            case"October":
            case"December":

                System.out.println(monthName+" has 31 days");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println(monthName+"has 30 days");
                break;

            case "february":
                System.out.println(monthName + " has 28 or 29 days");
                break;

            default:
                System.out.println("Invalid month name");
                break;
        }
    }
        }

