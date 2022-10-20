package BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1235453, 3000, "Bob", "Bob@gmail.com", "6142225555");

        System.out.println(myAccount.getBalance());
    }
}