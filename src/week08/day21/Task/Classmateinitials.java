package week08.day21.Task;

import java.util.Arrays;

public class Classmateinitials {
    public static void main(String[] args) {


        String[]classMates={"TALHA", "AYSE", "LOKMAN", "ZEYNEP", "REMZI", "ENES", "EMIR","BUSRA","cemre","ECE"};

        for (String eachName : classMates) {
            System.out.println(eachName.charAt(0)+ " "+ eachName.charAt(eachName.indexOf(" ")+1));

        }




        }


    }


