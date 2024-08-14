package week04.day08.SwitchStatement;

public class SwitchIntro {

    public static void main(String[] args) {

/*

            A:Excellent
            B:Great Job
            C:Good
            D:Passed
            F:Failed

*/


        char grade='A';
    String result= "";
        if (grade=='A'){
            result="Excellent";
        } else if (grade== 'B') {
            result="Great job";

        }else if (grade=='C'){
            System.out.println("GOOD");
        }else if (grade=='D'){
            System.out.println("Passed");
        } else{
            System.out.println("Failed");
        }
        System.out.println(result);
        System.out.println("========================");

        switch(grade){
            case 'Q':
                System.out.println("Excellent");

            break;
            default:
                System.out.println("Invalid");
                break;
            case'B':
                System.out.println("Great job");

                break;
                case 'C':
                    System.out.println("Passed");

                    break;
                    case 'D':
                        System.out.println("Failed");

                        break;


        }
    }
}
