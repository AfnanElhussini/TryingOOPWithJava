package com.company;

public class Main {

    public static void main(String[] args) {
        Account a1=new Account();
         a1.insert(445123, "Mohammed", 10000);
         a1.deposite(12000);
          a1.withdraw(2000);
        System.out.println(a1);
        Account a2= new Account();
        a2.insert(9563145,"Belal",100);
        a2.deposite(50);
        a2.withdraw(140);
        a2.checkBalance();
        System.out.println();
    }
}
