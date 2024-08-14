package Arthurclass.week11.Lesson;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizQuestions {
    public static void main(String[] args) {
        System.out.println("=============== Question 1 ===============");
        System.out.println("Q: The index of the first element in an array is always _____?\nAnswer: 0");

        System.out.println("=============== Question 3 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(numbers.length); // 5
        System.out.println(numbers[numbers.length - 1]); // 50

        System.out.println("=============== Question 5 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        char[] charArray1 = {'a', 'b', 'c', 'd', 'e'};
        char[] charArray2 = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(charArray1 == charArray2); // false
        System.out.println(Arrays.equals(charArray1, charArray2)); // true

        System.out.println("=============== Question 8 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        int wd = 0; // 0 -1 0 2 4 3
        String[] days = {"Sun", "Mon", "Wed", "Sat"};

        for (int i = 0; i < days.length; i++) {
            switch (days[i]) {
                case "Sat", "Sun":
                    wd -= 1;
                    break;
                case "Mon":
                    wd += 1;
                case "Wed":
                    wd += 2;
            }
        }

        System.out.println(wd);

        System.out.println("=============== Question 9 ===============");
        System.out.println("Q: We can pass an array as a method argument. However, arrays cannot be return types. \n False");

        System.out.println("=============== Question 10 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        String[] planets = {"mercury", "Venus", "Earth", "Mars"};
        int x = planets.length; // 4
        int y = planets[1].length(); // 5

        System.out.println(x + " : " +y);

        System.out.println("=============== Question 12 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        ArrayList<String> colors = new ArrayList<>(); // green, red, blue, cyan, yellow
        colors.add("green"); // 0
        colors.add("red"); // 1
        colors.add("blue"); // 2
        colors.add("yellow"); // 3
        colors.add(3, "cyan");

        System.out.println(colors);

        System.out.println("=============== Question 14 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        ArrayList<Character> list = new ArrayList<>();

        for (char i = 'a'; i <= 'z'; i++){
            list.add(i);
        }

        boolean r = list.containsAll(Arrays.asList('a', 'c', 'D'));
        System.out.println(r);  // false

        System.out.println("=============== Question 15 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");
        ArrayList<String> colors2 = new ArrayList<>(); // yellow, blue
        colors2.add("Yellow");
        colors2.add("Red");
        colors2.add("Blue");
        colors2.remove(1);
        System.out.println(colors2.get(1));

    }

    public static int[] someMethod(int[] arr0) {
        return null;
    }
}
