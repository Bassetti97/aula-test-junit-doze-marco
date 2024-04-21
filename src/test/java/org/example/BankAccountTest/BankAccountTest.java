package org.example.BankAccountTest;

import org.example.BankAccount.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    public void testDepositValidValue() {
        BankAccount account = new BankAccount(1000.0, 500.0);
        account.deposit(500.0);
        assertEquals(1500.0, account.getCurrentBalance());
    }

    @Test
    public void testDepositNegativeValue() {
        BankAccount account = new BankAccount(1000.0, 500.0);
        account.deposit(-100.0);
        assertEquals(1000.0, account.getCurrentBalance());
    }

    @Test
    public void testDepositNullValue() {
        BankAccount account = new BankAccount(1000.0, 500.0);
        account.deposit(0.0);
        assertEquals(1000.0, account.getCurrentBalance());
    }

    @Test
    public void testWithdrawValueWithinTheLimit() {
        BankAccount account = new BankAccount(1000.0, 500.0);
        account.withdraw(300.0);
        assertEquals(700.0, account.getCurrentBalance());
    }

    @Test
    public void testWithdrawValueGreaterThanBalance() {
        BankAccount account = new BankAccount(1000.0, 500.0);
        account.withdraw(1500.0);
        assertEquals(1000.0, account.getCurrentBalance());
    }

    @Test
    public void testWithdrawValueExceedsLimit() {
        BankAccount account = new BankAccount(1000.0, 500.0);
        account.withdraw(300.0);
        account.withdraw(200.0);
        account.withdraw(300.0);
        assertEquals(500.0, account.getCurrentBalance());
    }

    @Test
    public void testWithdrawNegativeValue() {
        BankAccount account = new BankAccount(1000.0, 500.0);
        account.withdraw(-100.0);
        assertEquals(1000.0, account.getCurrentBalance());
    }

    @Test
    public void testWithdrawNullValue() {
        BankAccount account = new BankAccount(1000.0, 500.0);
        account.withdraw(0.0);
        assertEquals(1000.0, account.getCurrentBalance());
    }
}


