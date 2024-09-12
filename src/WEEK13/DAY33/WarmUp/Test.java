package WEEK13.DAY33.WarmUp;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        CydeoDevStudent jack=new CydeoDevStudent("Jack", 'M', LocalDate.of(2000,11,11),"A101","Zero to Hero",10);
        System.out.println(jack);


        jack.eat();
        jack.drink();


    }
}
