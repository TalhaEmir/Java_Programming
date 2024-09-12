package Tekrar.Tekrar.Days.Day19Tekrar;

public class min {

    public static void main(String[] args) {
        int[] num={13,3,4,5,6,77};

        int min[]={0};

        for (int i = 0; i < num.length; i++) {
            if (num[i]<min[i]) {
                min[i]=num[i];
            }

        }




    }
}
