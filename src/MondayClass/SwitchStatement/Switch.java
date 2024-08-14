package MondayClass.SwitchStatement;

public class Switch {


    public static void main(String[] args) {


        char grade = 'A';


        if (grade == 'A') {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Great Job");
        } else if (grade == 'C') {
            System.out.println("Good");
        } else if (grade == 'D') {
            System.out.println("passed");

        } else {
            System.out.println("failed");
        }
        System.out.println("========================");


        /*switch (grade){
            case 'A':
             System.out.println("Excellent");
                break;

             case 'B':
             System.out.println("Perfect");
             break;

             case 'C':
                 System.out.println("Good");
              break;

              case 'D':

                  System.out.println("failed");

                  break;

            default:

                System.out.println("invalid");
        }

*/

        //enhance switch



                /*int score = 85;
                String result = switch (score / 10) {
                    case 10 -> "A";
                    case 9 -> "B";
                    case 8 -> "c++";
                    case 7 -> "C";
                    case 6 -> "D";
                    default -> "F";
                };

                System.out.println("The grade is " + result);
*/

                int score=100;
                String result= switch (score/10) {
                    case 10->"Perfect";
                    case 9->"Pass";
                    case 8->"Fail";
                    default -> "default";
                };




            }
        }

