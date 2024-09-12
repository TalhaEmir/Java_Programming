package Tekrar.Tekrar.Array.Task2;

public class ClassMateReversed {

    public static void main(String[] args) {
        String []names={"TalhaEmir", " Nevbahar", "OmerEthem","Nurefsan","Remzi","Zeynep","Enes","Busra","Cemre","Ece"};

        for(int i= names.length-1; i>=0 ; i--){
            String eachName= names[i];
            String reverse="";
            for(int j= eachName.length()-1; j>=0; j--){
                reverse+= eachName.charAt(j);

                System.out.println(reverse);
            }
        }


    }
}
