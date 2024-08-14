package Week05.day12.task;

public class initial {

    public static void main(String[] args) {

        cognome("Teddo","Dogano");

        cognome("MOHAMMAD","KARIM");

        cognome("Hasan", "Dogan");

    }

    public static void cognome(String firstName, String lastName) {
      String initial= firstName.substring(0,1).toUpperCase()+"." + lastName.toUpperCase().substring(0,1);
      System.out.println("initial = " + initial);

    }

}


