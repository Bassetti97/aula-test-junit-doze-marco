package org.example.BankAccount;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(1000.0, 500.0);

        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Enter an option:");
            System.out.println("-------------------------------------------------------------");
            System.out.println("[1] Withdraw");
            System.out.println("[2] Deposit");
            System.out.println("[3] Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Current balance: " + account.getCurrentBalance());
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawalValue = scanner.nextDouble();
                    try {
                        account.withdraw(withdrawalValue);
                        System.out.println("Current balance: " + account.getCurrentBalance());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error when withdrawing: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositValue = scanner.nextDouble();
                    try {
                        account.deposit(depositValue);
                        System.out.println("Deposit made successfully. Current balance: " + account.getCurrentBalance());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error when depositing: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using our banking system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

