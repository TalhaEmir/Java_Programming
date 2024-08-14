package week07.Day18.warmup.BankAccount;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;


    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=  $" + balance +
                '}';
    }

    public void checkBalance() {
        System.out.println("your account balance is:  $" + balance);
    }

    public void deposit(double amount) {

        if (amount < 1 ) {
            System.out.println("You can't deposit negative amount" +amount);
            return;
        }
        balance = balance + amount;
        System.out.println("You are depositing" + amount + accountHolder );

    }


    public void withdraw(double amount) {


        if (amount >balance) {
            System.out.println("You can't withdraw negative amount" + amount);
            return;
        }

            System.out.println("Withdrawn " + amount + "to " + accountHolder);
            balance = balance - amount;
        }

    }






