package WEEK13.DAY33.WarmUp;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person1 {
    private final String id;
    private String batchName;
    private int batchNumber;
    public static final String programmingLanguage="Java Programming"; // or static block static { programmingLanguage;}

    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        if(getAge()<18){
            System.out.println("age can not be" +getAge() );
            System.exit(1);
        }
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);



    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        if(! ( batchName.equalsIgnoreCase("Zero to Hero") || batchName.equalsIgnoreCase("Alumni Dev"))){
            System.out.println("batchName can not be" + batchName + " no such a batch in Cydeo");
            System.exit(1);
        }

        this.batchName = batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if( ( batchNumber<=0)){
            System.out.println("batch number can not be" + batchNumber );
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public void drink() {
        System.out.println(getName() + " is drink" + programmingLanguage);

    }


    public void eat() {
        System.out.println(getName() + " is eating at the class of" + programmingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                "batchName='" + getBatchName() + '\'' +
                ", batchNumber=" + getBatchNumber() +
                ", id='" + id + '\'' +
                '}';
    }




}
