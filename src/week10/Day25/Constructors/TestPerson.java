package week10.Day25.Constructors;
import java.time.LocalDate;

public class TestPerson {

    public static void main(String[] args) {


        Person p1= new Person("Talha",30,LocalDate.of(1994,06,29),false,true);
        Person p2= new Person("Cemre",30,LocalDate.of(1992,07,01),false,true);
        Person p3= new Person("Enes",30,LocalDate.of(1994,10,15),true,false);
        Person p4= new Person("Merve",35,LocalDate.of(1989,06,28),true,false);
        Person p5= new Person("Fatih",36,LocalDate.of(1988,07,25),true,true);

        System.out.println(p1);
        p1.eats("bread");
        p1.drinks("water");
        System.out.println(p2);
        p2.eats("mushroom");
        p2.drinks("cola");
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);


    }
}
