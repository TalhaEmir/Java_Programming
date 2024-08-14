package week03.DAY07ifstatements.longvideo;

public class MULTI_BRANCHIFSTATEMENT {

    public static void main(String[] args) {

        int numb = 200;
        String result = "";

        if (numb > 0) {
            result = "Positive";
        }
        if (numb < 0) {
            result = "Negative";
        }

        if (numb == 0) {

            result = "Zero";
        }
        System.out.println(result);

        System.out.println("=========================");

        String result2 = "";

        if (numb > 0) {
        result2 = "Positive";

        } else if (numb < 0) {

        result2 = "Negative";
        } else {

            result2 = "Zero";


        }

        System.out.println(result2);
    }

}