package WEEK13.DAY33.Employee;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String id, String jobTitle, int age, char gender, double salary, String programmingLanguage) {
        super(name, id, jobTitle, age, gender, salary);
        setProgrammingLanguage(programmingLanguage);
    }
    public void work() {
        System.out.println(getName() + " is developing code" + programmingLanguage);
    }


    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                "programming language " +  programmingLanguage + "}" ;
    }
}
