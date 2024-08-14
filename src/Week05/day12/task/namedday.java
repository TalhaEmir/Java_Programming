package Week05.day12.task;

public class namedday {

    public static void main(String[] args) {

        date(1);
        date(2);




        /* Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June/*
         */


        }

    public static void date(int month){

        switch (month){
            case 1:
                System.out.println("January");
                break;
             case 2:
                 System.out.println("February");
        }
    }
}
