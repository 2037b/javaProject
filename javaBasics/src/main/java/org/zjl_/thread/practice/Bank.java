package org.zjl_.thread.practice;

public class Bank implements Runnable {
    static int moneySum = 5000;
    static int moneyA = 0;
    static int moneyB = 0;

    @Override
    public void run() {
        while (moneySum - 200 >= 0) {
            synchronized (Bank.class) {
                if (Thread.currentThread().getName().equals("A")) {
                    System.out.println("A取了" + (moneyA += 100));
                    moneySum -= 100;
                }
                if (Thread.currentThread().getName().equals("B")) {
                    System.out.println("B取了" + (moneyB += 200));
                    moneySum -= 200;
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
