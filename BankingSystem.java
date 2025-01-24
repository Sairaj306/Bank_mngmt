import java.util.Scanner;

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accNum, double initialBal) {
        accountNumber = accNum;
        balance = initialBal;
        System.out.println("Account created with balance: " + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New balance: " + balance);
        }
    }

    void showBalance() {
        System.out.println("Your balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, balance);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Show Balance\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else if (choice == 3) {
                account.showBalance();
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option, try again.");
            }
        }
        scanner.close();
    }
}
