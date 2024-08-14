package Tekrar.Tekrar.Array.Task;

public class NormalLoop {
    public static void main(String[] args) {
        String[] names = {"Zeynep", "Remzi", " Mehmet", "Talha", "Busra", "Cemre", "Ece", "Nevbahar", "Nurefsan", "Omer Ethem"};




        for (int j = 0; j < names.length; j++) {  // Normal for döngüsü
            String reversedName = "";
            String eachName = names[j];  // İlgili ismi alıyoruz

            for (int i = eachName.length() - 1; i >= 0; i--) {  // İsimleri tersten okuma
                reversedName += eachName.charAt(i);
            }

            System.out.println(reversedName);  // Ters çevrilmiş ismi yazdırma
        }
    }
}
