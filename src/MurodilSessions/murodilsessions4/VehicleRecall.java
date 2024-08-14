package MurodilSessions.murodilsessions4;

public class VehicleRecall {
    public static void main(String[] args) {

        /*
VehicleRecall [if else, logical , comparison operators, ternary]
SDET Motors Inc. is recalling all vehicles from model years:

2001-2002,
2004-2006,
2015-2018

declare variable modelYear write a statement
that prints the message "RECALL"
if the value of modelYear falls within those ranges.
Otherwise, print "NOT RECALL"
         */

            int modelYear= 2002;

            if((modelYear>= 2001 && modelYear<=2002) ||(modelYear>=2004 && modelYear<=2006) || modelYear>=2015){
                System.out.println("Vehicle Recall");
            }else {
                System.out.println("Vehicle Not Recall");
            }


    }
}
