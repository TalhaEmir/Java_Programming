package Arthurclass.week11.Lesson;

public class Code {

    public static void main(String[] args) {
        String[] days = {"Sun", "Mon", "Wed", "Sat"};

        int wd=0;

        for (int i = 0; i < days.length; i++) {
            switch (days[i]) {
                case "Sat":
                case "Sun":
                    wd -= 1;
                    break;
                case "Mon":
                    wd += 1;
                    break;
                case "Wed":
                    wd += 2;
                    break;
            }
        }
    }
}
