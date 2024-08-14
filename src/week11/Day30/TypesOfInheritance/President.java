package week11.Day30.TypesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class President extends Person {


    public President(String name,char gender, LocalDate DOB, LocalDate electedDate) {
        super(name, gender, DOB);
        this.electedDate = electedDate;
    }


    private LocalDate electedDate;

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }


    public void lie(){

        System.out.println(getName() + "always lying from his " +getElectedDate() );
    }
}
