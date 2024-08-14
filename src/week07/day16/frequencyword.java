package week07.day16;

public class frequencyword {

    public static void main(String[] args) {

        String asd=" Java Java Java Java";
        String dsa=" Java";
        int deuctible=0;

        asd=asd.toLowerCase();
        dsa=dsa.toLowerCase();

        while (asd.contains(dsa)) {
            deuctible++;
            asd=asd.replaceFirst(dsa, "");
        }

        System.out.println(deuctible);

    }



}
