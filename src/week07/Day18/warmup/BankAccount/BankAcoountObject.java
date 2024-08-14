package week07.Day18.warmup.BankAccount;

public class BankAcoountObject {
    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
      obj1.setInfo("Kadir", 123456789);
        System.out.println(obj1);

        obj1.deposit(1000);

        obj1.checkBalance();

        obj1.withdraw(700);

        obj1.checkBalance();

        obj1.deposit(-1000);
        obj1.checkBalance();

        obj1.withdraw(5000);


        System.out.println("====================");

        BankAccount account1 = new BankAccount();

        BankAccount account2 = new BankAccount();

        account1.setInfo("Sebeastian", 987654321);
        account2.setInfo("Umran", 456789890);


      account1.deposit(5000);
      System.out.println(account1);
      account2.deposit(10000);
      System.out.println(account2);

      account1.withdraw(1000);
      System.out.println(account1);
      System.out.println(account2);





















    }
}
