package org.zjl_.banyuan.day_03.extends_04.bank;

/**
 * 写一个名为Account的类模拟账户。该类的属性和方法如下所示：
 * 该类包括的属性:账号id,余额balance,年利率annualInterestRate;
 * 包含的方法:访问器方法(getter和setter方法),取款方法withdraw(),存款方法deposit()。
 * 提示:在提款方法withdraw中,需要判断用户余额是否能够满足提款数额的要求,如果不能,应给出提示。
 * B.创建Customer类。
 * a. 声明三个私有对象属性:firstName、lastName和account。
 * b. 声明一个公有构造器,这个构造器带有两个代表对象属性的参数(f和l)
 * c. 声明两个公有存取器来访问该对象属性,方法getFirstName和getLastName返回相应的属性。
 * d. 声明setAccount 方法来对account属性赋值。
 * e. 声明getAccount 方法以获取account属性。
 */
public class Account {
    private String id;
    private double balance;
    private double annualInterrestRate;

    Account(String id, double balance, double annualInterrestRate) {
        setId(id);
        setBalance(balance);
        setAnnualInterrestRate(annualInterrestRate);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterrestRate() {
        return annualInterrestRate;
    }

    public void setAnnualInterrestRate(double annualInterrestRate) {
        this.annualInterrestRate = annualInterrestRate;
    }

    void withdraw(double money) {
        if (money > balance)
            System.out.println("余额不足，取款失败。");
        else {
            balance -= money;
            System.out.println("成功取出：" + money);
        }
    }

    void deposite(double money) {
        balance += money;
        System.out.println("成功存入：" + money);
    }
}
