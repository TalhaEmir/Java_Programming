package Tekrar.Tekrar.Array.Task;

import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {
        String str = "heart";
        String str2 = "earth";

        // Uzunluk kontrolü
        if (str.length() != str2.length()) {
            System.out.println("False");
            return;
        }

        char[] str1 = str.toCharArray();
        char[] str3 = str2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str3);

        boolean isAnagram = true;

        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != str3[i]) {
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram);
    }

    }

