package WEEK13.day35.LastTasks;

public class TestEmployeeObject {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("James", 34, 'M', "B1", "Math Teacher", 75000);
        Developer devs1 = new Developer("James", 34, 'M', "B1", "Full Stack Tester", 75000, "Java");
        Tester talha = new Tester("Talha", 34, 'M', "B1", "PR", 95000);
        Driver ted = new Driver("Ted", 34, 'M', "D1", "Truck Driver", 95000);

        teacher.work();//James is teaching
        devs1.work();//James is developing codeFull Stack Tester

        Employee[] employees = {
                new Tester("Hamza", 32, 'M', "A01", "QA", 110000),
                new Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Tester("George", 28, 'M', "A03", "SDET", 120000),
                new Developer("Yulia", 23, 'F', "A04", "Software Developer", 135000, "Python"),
                new Tester("Cihad", 30, 'M', "A05", "SDET", 105000),
                new Developer("Gulistan", 26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Tester("Nora", 28, 'F', "A07", "QE", 120000),
                new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
                new Developer("Diana", 29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Tester("Tatiana", 25, 'F', "A09", "SDET", 130000),
                new Developer("Alena", 26, 'F', "A10", "Back-end Developer", 150000, "Java"),
                new Tester("Timur", 29, 'M', "A11", "SDET", 115000),
                new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000),
                new Developer("Hasan", 26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
                new Tester("Nataliia", 24, 'F', "A13", "QE", 125000),
                new Developer("Ermek", 26, 'M', "A14", "Full Stack Developer", 142000, "Java"),
                new Tester("Khashayar", 30, 'M', "A15", "SDET", 105000),
        };

        int numberOfDeveloper=0;
        int numberOfTester=0;
        int numberOfTeacher=0;
        int numberOfDriver=0;



        System.out.println("==========================");


        for (Employee each : employees) {
            if( !(each instanceof Developer) ){
                System.out.println(each);
            }
        }




        for( int i=0 ; i<employees.length ; i++){

            System.out.println(employees[i].getName() +employees[i].getJobTitle());

            if( employees[i] instanceof Developer){
                numberOfDeveloper++;
            }
            if( employees[i] instanceof Tester){
                numberOfTester++;
            }

            if( employees[i] instanceof Teacher){
                numberOfTeacher++;
            }
            if( employees[i] instanceof Driver){
                numberOfDriver++;
            }


        }




        System.out.println(numberOfDeveloper);
        System.out.println(numberOfTester);
        System.out.println(numberOfTeacher);
        System.out.println(numberOfDriver);

    }




}
