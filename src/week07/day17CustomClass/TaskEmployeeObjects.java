package week07.day17CustomClass;

public class TaskEmployeeObjects {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.setInfo("Sumeye",28,'F',"Java Developer", 95000,"A12");

        Employee employee2 = new Employee();
        employee2.setInfo("Khashavar",29,'M',"back end Developer", 98000,"B13");

        Employee employee3 = new Employee();
        employee3.setInfo("abidullah", 30, 'm', "front end developer", 99000, "C14");



        employee3.age=39;
        employee3.name="lucy";
        employee3.gender='f';
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();

        employee3.work();










    }

}
