package com.yousefzadeh.exresice7_6;

public class Bank {

    public void withdraw(Account account , double price) {
        try {
            synchronized (account) {

                double oldprice = account.getBalance();
                if (oldprice - price < 0) {
                    System.out.println("Balance isn't enough.");
                    account.wait();
                }

                System.out.println("Customer "+Thread.currentThread().getName()+" is withdrawing money.");
                account.setBalance(oldprice - price);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}