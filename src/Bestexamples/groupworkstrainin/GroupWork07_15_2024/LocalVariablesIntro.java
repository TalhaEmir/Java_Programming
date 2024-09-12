package Bestexamples.groupworkstrainin.GroupWork07_15_2024;

public class LocalVariablesIntro {
    public static void main(String[] args) {

//create a function that can display the cube of a number
                        //argument
        displayCube(4);
        displaySquare(5);


    }

                                    //parameter
    public static void displayValue(int num){ //local variables
        System.out.println("Value of " + num + " is " + num);
    }

    public static void displayCube(int num){
        int cube=num*num*num;
        System.out.println("Cube of " + num + " is " + cube);
    }

    public static void displaySquare(int num){

        //int square= num*num;
        int square;
        square=num*num;

        System.out.println("Square of " + num + " is " + square);


    }
}
