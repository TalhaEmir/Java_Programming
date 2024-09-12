package week14.Day36.ReferenceTypeCasting;


import WEEK13.DAY33.Employee.Developer;
import WEEK13.DAY33.Employee.Employee;
import week14.Day36.ReferenceTypeCasting.Animals.Animal;
import week14.Day36.ReferenceTypeCasting.Animals.Dog;
import week14.Day36.WarmUp.Phone.Iphone;
import week14.Day36.WarmUp.Phone.Nokia;
import week14.Day36.WarmUp.Phone.Phone;

public class ReferenceType_EqualsMethod {

    public static void main(String[] args) {


       // Cat cat= new Dog():

        System.out.println("========Upcasting Polymprhism========Impilicit casting========");


        Animal animal = (Animal ) new Dog();// parent referencing its child upcasting means bigger one gonna be smaller one
        // and it is gonna be implicitly automatically no need to (Animal )

        Animal animal1= new Dog(); // impilicit casting-> Upcasting Polymprhism
        System.out.println("========DownCasting  Polymprhism========EPLICIT cASTING=======");


       //  Animal animal = (Animal ) new Dog();


        ((Dog)animal1).bark();// down casting- one time usage-> bu usttekine referans ediyoe

        Dog dog1= (Dog)animal1;// down casting / long time using

        System.out.println("=======================================");

        animal1.eat();
        animal1.drink();
        animal.sleep();


        Animal animal2= new Dog();
       //  animal.scratch();--> wrong

       // ((Cat)animal1).scratch();//--> wrong --> ClassCastException.


        Phone phone1= new Nokia("XR20", "Small", 350, "White");// upcasting polymoprhism

        phone1.call(911);
        phone1.text(123456);

        ((Nokia) phone1).selfDefense();


           // ((Iphone) phone1).faceTime(1243242);// Nokia cn not be converted to Iphone, because there is no relationship between them

       // phone1.selfDefense();
       ((Nokia) phone1).selfDefense();


        Employee employee= new Developer("James","B1","Mat Teacher",34,'M',75000,"Full Stack Tester");

        employee.work();

       // System.out.println(employee.getProgrammingLanguage());// wrong because it does not exist at the this object type
        System.out.println(((Developer) employee).getProgrammingLanguage());

        //Tester tester= (Tester) employee();// it is referencing developer object
        //Driver driver=(Driver) employee;// wrong no retlationship between driver and  Developer

        // if there is no relationship it can not be any casting



        Iphone iphone1= new Iphone("Model iphon12","large", 1005,"Black");
        Iphone iphone2= new Iphone("Model iphon12","large", 1005,"White");

        System.out.println(iphone1.equals(iphone2));

    }
}
