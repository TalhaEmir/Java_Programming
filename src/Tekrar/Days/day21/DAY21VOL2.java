package Tekrar.Days.day21;

import java.util.Arrays;

public class DAY21VOL2 {
    public static void main(String[] args) {

        String [] group1={"Lucy", "Umran", "Sumeye", "Abibudllah"};
        String [] group2={"Madiyar", "Khashayar", "Rayhane"};
        String []group3={"Alena", "Evagenuya", "Shukur","Hasan", "bilal"};
        String[] group4={"Adilena", "Ali"};

        String [][] groups={group1, group2, group3,group4};
        //multidimensional
        System.out.println(Arrays.deepToString(groups));
        System.out.println(Arrays.toString(group1));
        System.out.println(Arrays.toString(group2));
        System.out.println(Arrays.toString(group3));
        System.out.println(Arrays.toString(group4));


        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup= groups[i];// bu groupsun icindeki grup halindeki sayilari cagiriyor tek bir veriye isaret etmiyor
            System.out.println(Arrays.toString(eachGroup));// brackets koymayag gerek yok
            for (int j = 0; j < eachGroup.length; j++) {
                String elements= eachGroup[j];
                System.out.println();

            }

            for (String[] eachGroups : groups) {// butun buyugu yazdircaksak deepToString
                System.out.println(Arrays.toString(eachGroups));//grupsa toStringicindeki gruplari teker teker yazdiriyor
                for (String eachStudent : eachGroups) {//elementleri yazdiriyor
                    System.out.println((eachStudent));
                    System.out.println(Arrays.toString(groups));//wrong toString()==>> for single dimensional arrays only
                    System.out.println(Arrays.deepToString(groups));// deep to String()===>>> for multidimensional arrays only

                }

            }
            }


        }

    }

