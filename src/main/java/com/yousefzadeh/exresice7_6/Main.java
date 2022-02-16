package com.yousefzadeh.exresice7_6;

public class Main {
    public static void main(String[] args) {

        Account account = new Account();
        account.setBalance(20);


        Thread customer1 = new Customer(account);
        customer1.setName("Customer1");
        customer1.start();
        Thread customer2 = new Customer(account);
        customer2.setName("Customer2");
        customer2.start();

    }
}
