package week10.Day27.Utilities;

public class Tets {
    public static void main(String[] args) {
        int[]numbers={10,20,30,40,50,60,70,80,90};
        ArraysUtility.contains(numbers,25);
        boolean has25=ArraysUtility.contains(numbers,25);
        System.out.println("has25="+has25);


        System.out.println("=======================");

        String[]students={"Sumeye", "Hamza", "Berk", "Marika"};

        System.out.println(ArraysUtility.contains(students,"Khashavar"));//false





    }

}
