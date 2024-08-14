package week09.day24.Tasks;

public class bendenedim {

    public static void main(String[] args) {
        String str = "aaaabbbcccddd";

        String result = "";


        for (int i = 0; i < str.length() - 1; i++) {
            int frequency = 0;
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }

            }

            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i) + "" + frequency;
            }

        }
        System.out.println(result);
    }

    }



