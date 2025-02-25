package Week12.Day32;

import java.time.LocalDate;

class Student{
    public void language(){
        System.out.println("Java Programming");
    }


}




public final class FinalKeyword extends  Student {

    /*
    public void language(){ // final methods can never be overridden
        System.out.println("Python Programming");
    }
*/

    public FinalKeyword(){

    }

    public final static void main(String[] args) {

        final char gender = 'M';

        System.out.println(gender); // M

        //  gender = 'F';
        System.out.println(gender); // F

        System.out.println("-----------------------------------");

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

        //  dateOfBirth = dateOfBirth.plusYears(1);
        System.out.println(dateOfBirth);

        System.out.println("-----------------------------------");

        new Student().language();
        new FinalKeyword().language();

        System.out.println("-----------------------------------");

        final String name = "James";
        // name = null;
        // name = "Daniel";

        System.out.println(name);
        final String names="James";

       // names=null;

        System.out.println(names);//null



    }

}