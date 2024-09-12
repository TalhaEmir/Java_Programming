package Tekrar.Tekrar.Array.Task;

public class ClassMatesReversed {

    public static void main(String[] args) {
        String[] names = {"Zeynep", "Remzi", " Mehmet", "Talha", "Busra", "Cemre", "Ece", "Nevbahar", "Nurefsan", "Omer Ethem"};

        for (String eachName : names) {
            String reversedName = "";

            for (int i = eachName.length() - 1; i >= 0; i--) {
                reversedName += eachName.charAt(i);

            }
            System.out.println(reversedName);
        }


        System.out.println("================================================================");



        for (String eachName : names) {

            System.out.println(reverse(eachName));
        }


    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }


}