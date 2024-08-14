package week08.day21.Instruction;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {


        String [] group1={"Lucy", "Umran", "Sumeye", "Abibudllah"};
        String [] group2={"Madiyar", "Khashayar", "Rayhane"};
        String []group3={"Alena", "Evagenuya", "Shukur","Hasan", "bilal"};
        String[] group4={"Adilena", "Ali"};

        String [][] groups={group1, group2, group3, group4};
            //index=        0      1         2       3

        System.out.println(Arrays.toString(groups));// yanlis kullanim
        System.out.println(Arrays.deepToString(groups));

        for (int i = 0; i < groups.length; i++) {
           String[]eachGroup=groups[i];
           System.out.println(Arrays.toString(eachGroup));
            for (int j = 0; j<eachGroup.length; j++) {
                String eachStudent=eachGroup[j];
                System.out.println(eachStudent);


                System.out.println("==================");

                for (String[] eachgroup : groups) {
                    System.out.println(Arrays.toString(eachgroup));
                    for(String eachstudent:eachgroup) {
                        System.out.println(eachstudent);
                    }

                }


                }


                }

        System.out.println("==================");
        for (int i = groups.length - 1; i >= 0; i--) {
            String[]eachGroup=groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (String eachstudent : eachGroup) {
                System.out.println(eachstudent);

            }


            }
        System.out.println(Arrays.toString(groups));//wrong toString()==>> for single dimensional arrays only
        System.out.println(Arrays.deepToString(groups));// deep to String()===>>> for multidimensional arrays only
            
        }






        
    }
