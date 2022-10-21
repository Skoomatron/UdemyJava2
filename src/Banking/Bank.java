package Banking;

import java.util.ArrayList;

public class Bank {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            this.branches.add(new Branch(name));
            return true;
        }
        return false;

    }
    public boolean addCustomer(String branch, String customer, double transaction) {
        Branch thisBranch = findBranch(branch);
        if (thisBranch != null) {
            return thisBranch.newCustomer(customer, transaction);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branch, String customer, double transaction) {
        Branch thisBranch = findBranch(branch);
        if (thisBranch != null) {
            return thisBranch.addCustomerTransaction(customer, transaction);
        }
        return false;
    }
    public Branch findBranch(String branch) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch thisBranch = this.branches.get(i);
            if (thisBranch.getName().equals(branch)) {
                return thisBranch;
            }
        }
        return null;
    }
    public boolean listCustomers(String branch, boolean transactions) {
        Branch thisBranch = findBranch(branch);
        if (branch != null) {
            System.out.println("Customer details for " + thisBranch.getName() + ".");
            ArrayList<Customer> customers = thisBranch.getCustomers();
            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                System.out.println("Customer: ");
                if (transactions) {
                    System.out.println("Transactions: ");
                    ArrayList<Double> trans = customer.getTransactions();
                    for (int x = 0; x < trans.size(); x++) {
                        System.out.println(x + " " + trans.get(i));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
