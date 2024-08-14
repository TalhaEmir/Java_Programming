package week08.day21.Task;

public class EvenOddNumbers {
    public static void main(String[] args) {


        /*
3. Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.*/

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        int odd=0;
        int even=0;

        for (int eachNum : nums) {
            if (eachNum%2==0){
                System.out.println();
               even++;
            }else {
                odd++;
            }

        }

        System.out.println("The Array has " + odd+ " odd numbers and " + even  );







    }

}
