package com.pract;
class BankAccount {

    protected double balance;

    public void printBalance() {
        System.out.println("Your account balance is $" + balance);
    }

}

class CheckingAccount extends BankAccount {

    @Override
    public void printBalance() {
        System.out.println("Your checking account balance is $" + balance);
    }

}
public class Account {
    public static void main(String[] args) {
       // BankAccount b=new CheckingAccount(600.00);
        BankAccount d,w,z;
        d=new CheckingAccount();

        BankAccount[] m={d};
        for (BankAccount monster : m) {



        }


    }
}
