package MurodilSessions.murodillivesessions3;

public class balance {

    public static void main(String[] args) {

        /*
        Balance [single if, operators, variables]

    Declare and assign the following variables
        amount balance & withdraw amount

    Check the balance after the withdrawal
        if you withdrew more money that you had in the account add a overdraft fee
        to the balance by subtracting $35

    In both cases print the remaining balance after withdrawing
         */


        double balanceAmount = 1000.0; // balance amount
        double withdrawalAmount = 2000.0; // withdraw amount

        //decrease balance amount by withdrawal amount
        balanceAmount -= withdrawalAmount;

        //check if balance amount is negative.And add 35$ fee

        if (balanceAmount < 0) {
            balanceAmount -= 35;
            System.out.println("Account overdraft fee applied");
            System.out.println("Your balance is " + balanceAmount);
        }else {
            System.out.println("Your balance is " + balanceAmount);


        }
        }


    }

