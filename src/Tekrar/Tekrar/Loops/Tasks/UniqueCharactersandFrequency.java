package Tekrar.Tekrar.Loops.Tasks;

public class UniqueCharactersandFrequency {
    public static void main(String[] args) {
        String str = "aabcccd";

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            char each = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (each == str.charAt(j)) {
                    frequency++;
                }

            }
            if(!unique.contains(""+ each)){
                unique +=each +""+frequency;
            }

        }

        System.out.println(unique);


    }
}