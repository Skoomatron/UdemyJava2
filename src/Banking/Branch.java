package Banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String name, double transaction) {
        if(findCustomer(name) != null) {
            return false;
        }
        return this.customers.add(new Customer(name, transaction));
    }
    public boolean addCustomerTransaction(String name, double transaction) {
        if (findCustomer(name) != null) {
            Customer customer = findCustomer(name);
            customer.addTransaction(transaction);
            System.out.println("Customer " + name + " deposited " + transaction + " dollars");
            return true;
        } else {
            System.out.println("Customer Not Found!");
            return false;
        }
    }
    public Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}
