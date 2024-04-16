import java.util.Scanner;

// Class representing the ATM
class ATM {
    private BankAccount bankAcc;

    public ATM(BankAccount bankAccount) {
        this.bankAcc = bankAccount;
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= bankAcc.getBalance()) {
            bankAcc.withdraw(amount);
            System.out.println("Withdrawal successful. Remaining balance: " + bankAcc.getBalance());
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            bankAcc.deposit(amount);
            System.out.println("Deposit successful. New balance: " + bankAcc.getBalance());
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to check balance
    public void checkBal() {
        System.out.println("Your current balance is: " + bankAcc.getBalance());
    }
}

// Class representing the user's bank account
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to get balance
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount(1000); // Initial balance of 1000

        ATM atm = new ATM(bankAccount);

        while (true) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBal();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
