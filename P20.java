abstract class Account2 {
    int accountNo;
    double balance;

    Account2(int accno, double bal) {
        this.accountNo = accno;
        this.balance = bal;
        System.out.println("SuperClass Account constructor invokes!!");
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void checkBalance() {
        System.out.println("Account No: " + accountNo + " | Balance: " + balance);
    }
}

class Savings2 extends Account2 {
    double interestRate;

    Savings2(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        System.out.println("SubClass Saving constructor invokes!!");
        this.interestRate = interestRate;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void addInterest() {
        double interest = balance * interestRate / 100.0;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

class Current2 extends Account2 {
    double overdraftLimit;

    Current2(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        System.out.println("SubClass Current constructor invokes!!");
        this.overdraftLimit = overdraftLimit;
    }

    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class P20 {
    public static void main(String[] args) {
        System.out.println("------Saving Account------");
        Savings2 s = new Savings2(101, 5000, 5); 

        s.deposit(1000);
        s.withdraw(2000);
        s.checkBalance();
        s.addInterest();
        s.checkBalance();
        System.out.println("------Current Account------");
        Current2 c=new Current2(201, 8000, 1000);
        c.deposit(5000);
        c.withdraw(15000);
        c.checkBalance();
        Current2 c2=new Current2(202, 5000, 1000);
        c2.deposit(5000);
        c2.withdraw(4000);
        c2.checkBalance();
    }
}