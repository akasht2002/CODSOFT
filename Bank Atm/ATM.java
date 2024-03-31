package CodeSoft;

import java.util.*;
public class ATM {
    private BankAccount userAccount;
    private Scanner scanner;

    // Constructor
    public ATM(BankAccount account) {
        this.userAccount = account;
        this.scanner = new Scanner(System.in);
    }

    // Method to display the ATM menu
    public void displayMenu() {
        System.out.println("\nWelcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    // Method to perform the selected action
    public void performAction(int choice) {
        switch (choice) {
            case 1:
                withdraw();
                break;
            case 2:
                deposit();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    // Method to withdraw money
    public void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (userAccount.withdraw(amount)) {
            System.out.println("Withdrawal successful. Remaining balance: $" + userAccount.checkBalance());
        }
    }

    // Method to deposit money
    public void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        userAccount.deposit(amount);
        System.out.println("Deposit successful. New balance: $" + userAccount.checkBalance());
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Your account balance is: Rs." + userAccount.checkBalance());
    }

    // Main method
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount account = new BankAccount(1000);

        // Create an instance of ATM
        ATM atm = new ATM(account);

        // Main loop
        while (true) {
            // Display the ATM menu
            atm.displayMenu();

            // Get user's choice
            System.out.print("Enter your choice: ");
            int choice = atm.scanner.nextInt();

            // Perform the selected action
            atm.performAction(choice);
        }
    }
}
