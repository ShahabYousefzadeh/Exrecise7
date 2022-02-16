package com.yousefzadeh.exresice7_6;

public class Customer extends Thread{
private Account account;

public Customer(Account account){
        this.account=account;
        }

public Account getAccount(){
        return account;
        }
@Override
public void run() {

        Bank bank = new Bank();
        for(int i = 1; i <100;i++) {
        bank.withdraw(account , 1);
        try {
        Thread.sleep(1000);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }

        }
        }
        }

