package org.zjl_.banyuan.day_03.extends_04.bank;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }

    String display() {
        return "Customer[" + firstName + "," + lastName + "]" + "has a account:id is  "
                + getAccount().getId() + ",annualInterestRate is "
                + (getAccount().getAnnualInterrestRate() * 100)
                + "%, balance is  " + getAccount().getBalance();
    }
}
