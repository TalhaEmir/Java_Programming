package week10.Day27.LONG;

import com.sun.tools.javac.Main;

public class CydeoStudent {
        public String name;
        public int age;
        public char gender;


    static{
        //nerede versigin onemli degil ha alt ha ustte public static String schoolName bunun
        schoolName="Cydeo School";
        secretCode="Wooden Spoon";
// it is work one time not every time
    }

    // thts how static block initialized statick variables

        public static String schoolName="Cydeo";// if there is more than one step to give value you can not put = sign
    public static String secretCode="Wooden Spoon";


    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
       // schoolName="Cydeo";
        //secretCode="Wooden Spoon";// thats not the wise choice it is gonna repeat every time when we call constructor

    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
