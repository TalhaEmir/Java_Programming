package week11.Day28.SetterAndGetterTasks.EmployeeTask;

public class TestEmployeeObject {
    public static void main(String[] args) {

        Employee employee1= new Employee(100000,"Dali",28,"");

        employee1.setSalary(1000);//Salary can not be less than 0, invalid salary= -1000.0

        System.out.println(employee1.getSalary());


        employee1.setName("       ");
        System.out.println(employee1.getName());

        Employee employee2=new Employee(100000,"Ali",28," ");


    }
}
