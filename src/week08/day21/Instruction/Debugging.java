package week08.day21.Instruction;

import java.util.Arrays;

public class Debugging {

    public static void main(String[] args) {

        String[] group1 = {"Lucy", "Umran", "Sumeye", "Abibudllah"};
        String[] group2 = {"Madiyar", "Khashayar", "Rayhane"};
        String[] group3 = {"Alena", "Evagenuya", "Shukur", "Hasan", "bilal"};
        String[] group4 = {"Adilena", "Ali"};

        String[][] groups = {group1, group2, group3, group4};
        //index=        0      1         2       3

  for (int i = 0; i < groups.length; i++) {//group 1 , group 2 ,group3,group 4
            String[] eachGroup = groups[i];
  System.out.println(Arrays.toString(eachGroup));
for (int j = 0; j < eachGroup.length; j++) {// gruplarin her bir elementi
   String eachStudent = eachGroup[j];
  System.out.println(eachStudent);
            }
        }
    }

}