package Tekrar.Tekrar.Array.Task2;

import week07.day17CustomClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Employeee {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

for(Employee each: employees){
    System.out.println("Name: " + each.name + ", Job Title: " + each.jobTitle);
}

        for(Employee each: employees ){
            if(each.jobTitle.equals("Java Developer")){
                System.out.println(each.name);
            }
        }




    }






}
