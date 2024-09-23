package com.deloitte.lab4.ex1;

class Person {
    private String name;
    private Account account;

    public Person(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}

abstract class Account {
    private static int accountCounter = 1;
    private final int accNum;
    protected double balance;

    public Account(double initialBalance) {
        this.accNum = accountCounter++;
        this.balance = initialBalance;
    }

    public int getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract boolean withdraw(double amount);

    @Override
    public String toString() {
        return "Account Number: " + accNum + ", Balance: " + balance;
    }
}

class SavingsAccount extends Account {
    private final double minimumBalance = 500;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            super.balance -= amount; // Use super to access the protected variable
            return true;
        }
        System.out.println("Withdrawal denied. Minimum balance of " + minimumBalance + " must be maintained.");
        return false;
    }
}

class CurrentAccount extends Account {
    private final double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            super.balance -= amount; // Use super to access the protected variable
            return true;
        }
        System.out.println("Withdrawal denied. Overdraft limit reached.");
        return false;
    }
}

public class Lab4Ex1 {
    public static void main(String[] args) {
        
    	SavingsAccount smithAccount = new SavingsAccount(2000);
        CurrentAccount kathyAccount = new CurrentAccount(3000, 1000);


        Person smith = new Person("Smith", smithAccount);
        Person kathy = new Person("Kathy", kathyAccount);

        System.out.println(smith.getName() + "'s " + smith.getAccount());
        System.out.println(kathy.getName() + "'s " + kathy.getAccount());

        smith.getAccount().deposit(2000);
        System.out.println("\nAfter depositing 2000 to " + smith.getName() + "'s account: " + smith.getAccount());

        if (kathy.getAccount().withdraw(2000)) {
            System.out.println("Withdrawal successful from " + kathy.getName() + "'s account.");
        }
        System.out.println("\n"+kathy.getName() + "'s account after withdrawal: " + kathy.getAccount());

        if (!kathy.getAccount().withdraw(5000)) {
            System.out.println("Withdrawal attempt of 5000 from " + kathy.getName() + "'s account failed.");
        }

        System.out.println("\nFinal balances:");
        System.out.println(smith.getName() + "'s account: " + smith.getAccount());
        System.out.println(kathy.getName() + "'s account: " + kathy.getAccount());
    }
}
