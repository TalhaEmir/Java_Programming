package week08.day20.Methods;
import java.util.Arrays;

public class EqualsMethod {

    public static void main(String[] args) {

        char[]arr1={'A','B','C'};
        char[]arr2={'A','C','B'};

        Arrays.equals(arr1,arr2);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean result=Arrays.equals(arr1,arr2);

        System.out.println(result);





    }
}
