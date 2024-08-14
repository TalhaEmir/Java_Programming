package MurodilSessions.week06;

public class MethodsWithReturn {

    public static void main(String[] args) {

    //giveMe5dolars() returns 5
        System.out.println( giveMe5dolars());
        System.out.println("Tahnk you for $" + giveMe5dolars());
        int dollars= giveMe5dolars();// we can assign because it is not void
        System.out.println("dolars =" + dollars);
        int age= getAge(2000);
        System.out.println("age =" + age);
        System.out.println(getAge(2000));


    }

    public static int giveMe5dolars() {
        return 5;

        //getage(int birthYear)=> return age
        //getAge(2000)=> 24
        // accetps year of birth , then returns age for that person. Current year 2024



    }

    public static int getAge(int birthYear){
        int ageResult= 2024- birthYear;
        return ageResult;

    }
}
