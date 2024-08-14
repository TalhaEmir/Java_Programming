package week10.Day25.Constructors;
import java.time.LocalDate;

public class TestEmployee {

    public static void main(String[] args) {

        Employee e1=new Employee("Kashavar",32,'M',"Java Developer",95000,LocalDate.of(2022,12,2));
        Employee e2=new Employee("Mohammad",31,'M',"JProject Manager",120000,LocalDate.of(2021,10,6));

        System.out.println(e1);
        System.out.println(e2);


    }
}
