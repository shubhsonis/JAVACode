
// 16)  Create a program that helps banks to maintain records. It should havefollowing facilities.
// Anybody can create current or saving account with following initial information:account number, name, balance, and branch.
// display account detail for a particular accounts.
// display total money deposited in bank.
// allow deposit and withdrawal in an account .
// for saving account opening balance and minimum balance must be 5000.
// for current account opening balance and minimum balance must be 1000.
// can not withdraw the amount from the account that makes balance less than the minimum balance.

import java.util.Scanner;

class Bank {
    private int accountno, balance;
    private String name, branch;

    public Bank() {
    }

    public Bank(String name, int accountno, String branch, int balance) {
        this.accountno = accountno;
        this.balance = balance;
        this.name = name;
        this.branch = branch;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Branch : " + branch);
        System.out.println("Account Number : " + accountno);
        System.out.println("Balance : " + balance);
    }

    public int getBalance() {
        return balance;
    }

    public void setDeposit(int bal) {
        balance += bal;
    }

    public void setWithdraw(int bal) {
        balance -= bal;
    }

    public void deposited(int amount) {
    }

    public void withdraw(int amount) {
    }
}

class SavingAcc extends Bank {
    public SavingAcc() {
    }

    public SavingAcc(String name, int accno, String branch, int x) {
        super(name, accno, branch, x);
    }

    public void display() {
        System.out.println("\nSaving Account details below :");
        super.display();
    }

    public void deposited(int amount) {
        int bal = getBalance() + amount;
        System.out.println("\nBalance After Deposit  : " + bal);
        setDeposit(bal);
    }

    public void withdraw(int amount) {
        if (getBalance() - amount >= 5000) {
            int bal = getBalance() - amount;
            System.out.println("Balance After WithDrow : " + bal);
            setWithdraw(bal);
        } else {
            System.out.println("Insufficient Balance : ");
        }
    }
}

class CurrentAcc extends Bank {
    public CurrentAcc() {
    }

    public CurrentAcc(String name, int accno, String branch, int y) {
        super(name, accno, branch, y);
    }

    public void display() {
        System.out.println("\nCurrent Account details below : ");
        super.display();
    }

    public void deposited(int amount) {
        int bal = getBalance() + amount;
        System.out.println("\nBalance After Deposit  : " + bal);
        setDeposit(bal);
    }

    public void withdraw(int amount) {
        if (getBalance() - amount >= 10000) {
            int bal = getBalance() - amount;
            System.out.println("Balance After WithDrow : " + bal);
            setWithdraw(bal);
        } else {
            System.out.println("Insufficient Balance : ");
        }
    }
}

public class inher16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name ");
        String name = sc.nextLine();

        System.out.println("Enter Branch Name");
        String branch = sc.nextLine();

        System.out.println("what Ac do you want to open : \n saving or current ");
        String check = sc.next();

        Bank cust;

        if (check.equals("saving")) {
            cust = new SavingAcc(name, 812345654, branch, 5000);
        } else {
            cust = new CurrentAcc(name, 654214586, branch, 10000);
        }

        cust.display();

        System.out.println("Do you want to Deposit or Withdraw : ");
        String safe = sc.next();

        int amount = 0;
        if (safe.equals("Deposit")) {
            System.out.println("How many Amount you want to Deposit ");
            amount = sc.nextInt();
            cust.deposited(amount);
        } else {
            System.out.println("How many Amount you want to Withdraw ");
            amount = sc.nextInt();
            cust.withdraw(amount);
        } 
    }
}
