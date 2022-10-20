package BankAccount;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(0, 0, "Null", "Null", "Null");
    }

    public BankAccount(long number, double balance, String name, String email, String phone) {
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = name;
        this.email = email;
        this.phoneNumber = phone;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void addFunds(long deposit) {
        this.balance += deposit;
    }
    public void withdrawFunds(long amount) {
        if (this.balance - amount > 0) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
