package Haydenclass.week07;

public class solution {


    public static void main(String[] args) {
        String str = "aaaabbbcddcdd";
        String result = "";

        int count = 1; // Start with 1 because we are already counting the first occurrence

        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result += str.charAt(i) + "" + count;
                count = 1; // Reset count for the next character
            }
        }

        // Append the last character and its count
        result += str.charAt(str.length() - 1) + "" + count;

        System.out.println(result); // Output the result
    }
}

