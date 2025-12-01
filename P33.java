// Custom exception for insufficient funds

class NotSufficientFundException extends Exception {

    NotSufficientFundException(String m) {
        super(m);
    }
}

class BankAccount {

    double balance;

    BankAccount(double amount) {
        balance = amount;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    void withdraw(double amount) throws NotSufficientFundException {
        if (amount > balance) {
            throw new NotSufficientFundException("Not Sufficient Fund | Balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
    }
}

public class P33 {

    public static void main(String[] args) {
        try {
            BankAccount acc = new BankAccount(0);
            acc.deposit(1000);
            acc.withdraw(400);
            acc.withdraw(300);
            acc.withdraw(500); // throws exception
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
