package week07.day17CustomClass.tasks.Adress;

public class Adress {
    public int buildingNumber;
    public String street;
    public String city;
    public String state;
    public String zip;



    public String toString() {
        return
                buildingNumber + street + "\n" + city + '\'' + state + '\'' + zip ;
    }
}
