package week06.Day14.tasks;

public class DayAndMonth {


    public static void main(String[] args) {

day(1);
        System.out.println(day(2));

    }


    public static String day(int n1) {
            String  result="";

      result =(n1==1)?"Monday":(n1==2)?"Tuesday":(n1==3)?"Wednesday":(n1==4)?
              "Thursday":(n1==5)?"Friday":(n1==6)?"Saturday":(n1==7)?"Sunday":"Invalid day ";

      return result;
    }













}
