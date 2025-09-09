package Constructor;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Invalid withdrawal or insufficient balance!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
        System.out.println("-----------------------------");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Account Number: " + accountNumber);   // public → accessible
        System.out.println("Account Holder: " + accountHolder);   // protected → accessible in subclass
        System.out.println("Balance: ₹" + getBalance());          // private → via getter
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("-----------------------------");
    }
}

public class acess_prob3 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Aman", 5000);
        acc1.displayAccountDetails();
        acc1.deposit(2000);
        acc1.withdraw(3000);
        acc1.displayAccountDetails();

        SavingsAccount sAcc = new SavingsAccount(201, "Riya", 10000, 4.5);
        sAcc.displaySavingsDetails();
        sAcc.deposit(2000);
        sAcc.displaySavingsDetails();
    }
}
