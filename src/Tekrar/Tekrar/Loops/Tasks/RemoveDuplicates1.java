package Tekrar.Tekrar.Loops.Tasks;

public class RemoveDuplicates1 {

    public static void main(String[] args) {

        String str = "aabbccdd";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!result.contains(""+ each)){
                result += each;
            }

            if (result.indexOf(each) == -1) {
                result += each;
            }

            }

        }
    }
