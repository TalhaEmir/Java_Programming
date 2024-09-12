package WEEK13.DAY33.Employee;

public class TestEmployeeObject {
    public static void main(String[] args) {

        Teacher teacher= new Teacher("James","B1","Mat Teacher",34,'M',75000);
        Developer devs1= new Developer("James","B1","Mat Teacher",34,'M',75000,"Full Stack Tester");
       Tester talha= new  Tester("Talha","B1","PR",34,'M',95000);
       Driver ted= new  Driver("Talha","B1","PR",34,'M',95000);


        teacher.work();//James is teaching
        devs1.work();//James is developing codeFull Stack Tester



    }
}
