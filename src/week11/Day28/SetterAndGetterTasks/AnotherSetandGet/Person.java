package week11.Day28.SetterAndGetterTasks.AnotherSetandGet;

public class Person {

   private String name;
   private int age;

    public String getName(){//getter
        if(name==null){
            System.err.println("Name must to be set;");
            System.exit(1);
        }

        return name;
    }

    public void setName(String name){//setter
        if(name.isEmpty()){
            System.err.println("Name can not be empty;");
            System.exit(1);
        }

        this.name=name;
    }// for setting value


    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age<0){
            System.err.println("Age can not be set to negative " + age);
            System.exit(1);
        }
        this.age=age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }// and getting value
}
