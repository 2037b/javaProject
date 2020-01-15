package org.zjl_.banyuan.day_03.extends_04.bank;

public class AccountTest {
    public static void main(String[] args) {
        Customer js = new Customer("Jane", "Smith");
        js.setAccount(new Account("1000", 2000, 0.0123));
        System.out.println(js);
        js.getAccount().deposite(100);
        js.getAccount().withdraw(960);
        js.getAccount().withdraw(2000);
        System.out.println(js.display());
    }
}
