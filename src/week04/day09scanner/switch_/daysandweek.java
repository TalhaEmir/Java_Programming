package week04.day09scanner.switch_;

import java.util.Scanner;

public class daysandweek {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.println("Enter the day of the number");
        // int num= new Scanner(System.in);
        int num= input.nextInt();

        String day= "Invalid";
        if(num>=1 && num <=7){
            day= (num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thursday"
                    : (num==5)?"Friday":(num==6)?"Saturday":"Sunday";
        }

            System.out.println(day);
            input.close();




    }

}



