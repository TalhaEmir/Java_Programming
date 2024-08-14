package week09.day24.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class UpperAndLowerCase {


    public static void main(String[] args) {




}

    public static boolean lowerUpperCase(String str){
        int lowercase=0;
        int uppercase=0;

        for(char each: str.toCharArray()){
            if(Character.isLowerCase(each)){
                lowercase++;
            }
            if(Character.isUpperCase(each)){
                uppercase++;
            }



        }
        return uppercase==lowercase;

    }
    }