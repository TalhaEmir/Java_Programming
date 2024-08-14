package Tekrar.Tekrar.Array.Task;

public class ClassMatesInitials {

    public static void main(String[] args) {


        String[] names={ "Zeynep", "Remzi", " Mehmet", "Talha", "Busra","Cemre","Ece","Nevbahar","Nurefsan","Omer Ethem"};


        for(int i=0 ; names.length>i ; i++){
            System.out.print(names[i].trim().substring(0,1)+ "."+" ");
        }

    }
}
