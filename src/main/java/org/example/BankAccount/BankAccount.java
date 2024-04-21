package org.example.BankAccount;

public class BankAccount {

    private Double currentBalance;
    private Double limitWithdrawal;
    private Double totalWithdrawalValue = 0.0;

    public BankAccount(Double currentBalance, Double limitWithdrawal) {
        this.currentBalance = currentBalance;
        this.limitWithdrawal = limitWithdrawal;
    }

    public void deposit(double value) {
        System.out.println("--------------- DEPOSIT ----------------");
        if (value <= 0) {
            System.out.println("Invalid deposit amount. Operation not performed.");
            return;
        }

        currentBalance += value;
        System.out.println("Current balance: " + currentBalance);
        System.out.println("Deposit amount: R$" + value);
        System.out.println("Total amount after deposit: R$" + currentBalance);
    }

    public void withdraw(double value) {
        System.out.println("------------- WITHDRAW ---------------");
        if (value <= 0) {
            System.out.println("Invalid withdrawal amount. Operation not performed.");
            return;
        }

        if (value > currentBalance) {
            System.out.println("Insufficient balance to make the withdrawal. Transaction denied!");
            return;
        }

        if ((value + totalWithdrawalValue) > limitWithdrawal) {
            System.out.println("Withdrawal limit reached. Transaction denied!");
            return;
        }

        currentBalance -= value;
        totalWithdrawalValue += value;
        System.out.println("Withdrawal amount: R$" + value);
        System.out.println("Withdrawal successful!");
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }
}

