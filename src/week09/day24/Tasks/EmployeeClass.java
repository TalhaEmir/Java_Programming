package week09.day24.Tasks;


import week07.day17CustomClass.Employee;
import java.util.Arrays;
import java.util.ArrayList;
public class EmployeeClass {

    public static void main(String[] args){

        //Employee class ismi
       /// employees= object ismi ayni zamanda variable

        ArrayList<Employee> employees = new ArrayList<>();//byte short cannot be/ it should be capital letter and wrapper class
        System.out.println(employees);//[]

       /* ArrayList<String>konu= new ArrayList <>();// bunun icine baska stringler yaziyoruz
        konu.add("1");==new Employee(),
        konu.add("2");==new Employee() ama bir kapidan girdim baska bir kapi dah var  o da new Employee()
        */

        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));
        System.out.println(employees);//[Employee{name='null', age=0, gender= , jobTitle='null', salary=0.0, id='null'}, Employee{name='null', age=0, gender= , jobTitle='null', salary=0.0, id='null'}, Employee{name='null', age=0, gender= , jobTitle='null', salary=0.0, id='null'}, Employee{name='null', age=0, gender= , jobTitle='null', salary=0.0, id='null'}, Employee{name='null', age=0, gender= , jobTitle='null', salary=0.0, id='null'}]

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        System.out.println(employees);//[Employee{name='Josh', age=34, gender=M, jobTitle='Java Developer', salary=100000.0, id='A01'}, Employee{name='null', age=0, gender= , jobTitle='null', salary=0.0, id='null'}, Employee{name='null', age=0, gender= , jobTitle='null', salary=0.0, id='null'}, Employee{name='null', age=0, gender= , jobTitle='null', salary=0.0, id='null'}, Employee{name='null', age=0, gender= , jobTitle='null', salary=0.0, id='null'}]



       employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
       employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        System.out.println("=====================================================");

        for(Employee each:employees){//if no need to indeks put for each loop// buradaki Employee String gibi her bir element degil class
            //Employee aradaki baglanti , employee Employee classin employee objecti yani variable i gibi
            System.out.println(each.name+":"+ each.jobTitle);

        }
        System.out.println("=====================================================");


        for(Employee each:employees){
            if(each.jobTitle.equals("Java Developer")){
                System.out.println(each.name+ each.salary);// kapinini icindeki kapiya girdim yani burada each ierdeki her bir Employee
            }
        }
        System.out.println("=====================================================");






        double max= employees.get(0).salary;// ilk iscinin en fazla maas aldigini varsayiyoruz//100000
        double min=employees.get(0).salary;//100000

        String nameMax="";
        String maxJobTitle="";
        String nameMin="";
        String minJobTitle="";

        for(Employee each:employees){
            if(each.salary>max){//sirayla aliyor
                max=each.salary;//130000
               nameMax=each.name;
                maxJobTitle=each.jobTitle;
            }

            if(each.salary<min){
                min=each.salary;
                nameMin=each.name;
                minJobTitle=each.jobTitle;
            }



        }
        System.out.println(nameMax + maxJobTitle+ " = " + max);// Connor = 130000
        System.out.println(nameMin+ minJobTitle+ " = " + min);
        System.out.println("=====================================================");



        ArrayList<Employee>femaleEmployees=new ArrayList<>();
        ArrayList<Employee>maleEmployees=new ArrayList<>();

        for(Employee each:employees){
            if(each.gender=='M'){
                maleEmployees.add(each);
            }else{
                femaleEmployees.add(each);
            }

        }
        System.out.println(femaleEmployees.size());
        System.out.println(maleEmployees.size());


        employees.removeIf(p->p.salary>100000);

        for(Employee each:employees){
            System.out.println(each.name);//Josh
           // Emily
                  //  Bella
        }



        System.out.println("==============================================================================");

 /*1. Given the following arraylist of Employees:
ArrayList<Employee> employees = new ArrayList<>();
employees.addAll(Arrays.asList(
new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
));

employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
 employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

 Note: Employee class is imported from day17 package

1.1 Write a program that can display the name and job title of each employee

 1.2 Write a program that can display the names of "Java Developers"

 1.3 Write a progam that can display the maximum and minimum salary

 1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
 can add all the female employees and male emloyees to the femaleEmployees and maleEmployees arraylists
*/





    }
}
