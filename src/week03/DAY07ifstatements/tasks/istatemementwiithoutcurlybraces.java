package week03.DAY07ifstatements.tasks;

public class istatemementwiithoutcurlybraces {


    public static void main(String[] args) {

        int age=32;

        if (age>= 21){

        }else{
            System.out.println("not eligible");
        }

        System.out.println("================");


        if (age>=21) System.out.println("Eligible");
        else System.out.println("Not Eligible");

        System.out.println("================");

        int itemNumber =1;
        if(itemNumber==1){
            System.out.println("Eggs");
            System.out.println("Orange");
        }else if(itemNumber==2){
            System.out.println("Milk");
            System.out.println("Onion");
        }else{
            System.out.println("apple");
            System.out.println("cherry");

        }



        int day= 2; // 1-7

        System.out.println("================");

        if(day==1) System.out.println("Monday");
        else if(day==2) System.out.println("Tuesday");
        else if(day==3) System.out.println("Wednesday");
        else if(day==4) System.out.println("Thursday");
        else if(day==5) System.out.println("Friday");
        else if(day==6) System.out.println("Saturday");
        else if(day==7) System.out.println("Sunday");
//if statement without curly braces ni not good a practice
    }

}
