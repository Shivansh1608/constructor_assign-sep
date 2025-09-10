package assignment_2;

import java.util.ArrayList;

class Bank {
    String bankName;
    ArrayList<Customer> customers;

    Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println(customer.name + " opened an account in " + bankName);
    }

    void showCustomers() {
        System.out.println("\nCustomers of " + bankName + ":");
        for (Customer c : customers) {
            System.out.println(c.name + " - Balance: " + c.balance);
        }
    }
}

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}

public class prob_2 {
    public static void main(String[] args) {
        Bank bank1 = new Bank("HDFC Bank");
        Bank bank2 = new Bank("SBI Bank");

        Customer c1 = new Customer("Shivansh", 5000);
        Customer c2 = new Customer("Ananya", 8000);
        Customer c3 = new Customer("Rahul", 12000);

        bank1.openAccount(c1);
        bank1.openAccount(c2);

        bank2.openAccount(c2);
        bank2.openAccount(c3);

        c1.viewBalance();
        c2.viewBalance();
        c3.viewBalance();

        bank1.showCustomers();
        bank2.showCustomers();
    }
}
