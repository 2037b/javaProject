package org.zjl_.thread.practice;

public class Ticket implements Runnable {
    int ticket = 50;

    @Override
    public void run() {
        boolean flag = true;
        while (flag) {
            synchronized (Ticket.class) {
                if (ticket > 0) {
                    try {
                        Thread.sleep((int) (Math.random() * 1000) + 1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println(Thread.currentThread().getName() +
                                "卖第" + (ticket--) + "张票");
                    }
                } else flag = false;
            }
        }
    }
}
