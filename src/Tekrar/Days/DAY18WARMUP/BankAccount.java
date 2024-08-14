package Tekrar.Days.DAY18WARMUP;

public class BankAccount {



/*2. Create a custom class named BankAccount:
    Attributes:
            1. accountHolder
				2. accountNumber
				3. balance

    Actions:
            1. setInfo(): sets the accountHolder and accountNumber attributes
		            	2. toString(): displays the full account info
		                3. checkBalance():displays the available balance
		                4. deposit(amount): increases the balance by the specified amount
		        	5. withdraw(amount): decreases the balance by the specified amount

    */


    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }
    public void checkBalance(double balance) {
        this.balance = balance;

    }

    public void deposit(double amount) {
        double newBalance = balance + amount;
        if (amount <1 ) {
            System.out.println("You can't deposit negative amount");
            return;
        } else {
            System.out.println("your deposited amount is= $ " + newBalance + "from account " + accountNumber);
        }

        }

        public void withdraw(double amount) {
        double newBalance = balance - amount;
        if (amount <1 && amount > balance ) {
            System.out.println("You can't withdraw negative amount");
            return;
        }else {
            System.out.println("your withdrawal amount is= $ " + newBalance + " from account " + accountHolder);
        }


        }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}

