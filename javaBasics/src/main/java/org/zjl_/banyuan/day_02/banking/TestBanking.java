package org.zjl_.banyuan.day_02.banking;

import java.util.Scanner;

public class TestBanking {
    public static void main(String[] args) {
        System.out.print("请输入金额：");
        Account a1 = new Account(new Scanner(System.in).nextDouble());
        System.out.println("Creating an account with a   " + a1.getBalance() + "   balance");
        System.out.print("withdraw:");
        a1.withdraw(new Scanner(System.in).nextDouble());
        System.out.print("deposite:");
        a1.deposit(new Scanner(System.in).nextDouble());
        System.out.print("withdraw:");
        a1.withdraw(new Scanner(System.in).nextDouble());
        System.out.println("The account has a balance of " + a1.getBalance());
    }
}
