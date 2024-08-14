package week03.quizzes;

public class quieezess {


    public static void main(String[] args) {

        int value='m';
        System.out.println(value);


        char cd= 77;
        System.out.println(cd);

        long x=1000;
        int y= (int) x;

        System.out.println(x);
        System.out.println(y);


        int j=7;
        for(int i=0;i<j-1 ;i+=2){
            System.out.println(i);
        }

        String s="Cydeo";

        for (int i=0;i<s.length();i+=3){
            System.out.println(s.charAt(i));
        }

        int wd = 0;
        String[] days = {"Sun", "Mon", "Wed", "Sat"};

        for (int i = 0; i < days.length; i++) {
            switch (days[i]) {
                case "Sat":
                case "Sun":
                    wd -= 1;
                    break;
                case "Mon":
                    wd += 1;
                    // No break, so it falls through to "Wed"
                case "Wed":
                    wd += 2;
            }
        }

        System.out.println(wd);

        int[] num1 = new int[3];
        int[] num2 = {1, 2, 3, 4, 5};
        num1 = num2;

        for (int i = 0; i < num2.length; i++) {
            System.out.print(num1[i]);
        }

    }
}
