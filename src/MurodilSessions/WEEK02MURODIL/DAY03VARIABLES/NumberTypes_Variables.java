package MurodilSessions.WEEK02MURODIL.DAY03VARIABLES;

public class NumberTypes_Variables {

    public static void main(charstring[] args) {

        // variableName= Value;
        // age=10;
        // = equals sign is called assignment operator
        // Declaring and assigning at the same time
        // dataType variableName= value;


        //declare apples as int
        int apples= 15;

        //assing 15 to apples

        apples= 15;


        System.out.println(apples);
        System.out.println("apples");

        //combine decleration and assignment / initialization

        int bananas= 10;

        /*
        whole number types; byte, short, int, long
        decimal point types: float, double


         */



        byte n1=111;
        short n2=10555;
        int n3=324324235;
        long n4=2_423_523_554L;

        float n5= 3.22F;
        double n6= 543.5;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);


        byte n7= 44;
        // casting----> widening. Small type -->large---> it is automatically casts/ converts
        short n8= n7; // yani n7 deki deger n8 e kopyalanacak
        // implicit casting

        System.out.println(n8);

        //casting from larger to smaller type ---> explicit casting done manually
        int n9= 4321;
        short n10= (short)n9; //n9 daki deger n10 a kopyalanacak

        double n11= 53.3;
        float n12= (float)n11;


        //Murodil, Please explain about  the Task6 in day04. The  result of Perimeter gives me 31.400000000000002. I cant find the video where i missed  - String.format("%.1f",perimeter1)
        //Thanks.
        //the result must be 31.4

    //when casting from decimal to int, decimal point are dropped
        int n13= (int)n11;

        System.out.println(n7);
        System.out.println(n8);
        System.out.println(n9);
        System.out.println(n10);
        System.out.println(n11);
        System.out.println(n12);
        System.out.println(n13);








    }
}
