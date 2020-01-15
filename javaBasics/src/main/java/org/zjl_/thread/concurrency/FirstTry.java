package org.zjl_.thread.concurrency;

import org.zjl_.thread.charactor.Hero;

public class FirstTry {
    static final int N = 10000;

    public static void main(String[] args) {
        final Hero garen = new Hero("盖伦", 10000, 300);
        System.out.printf("%s的初始血量是：%.0f%n", garen.name, garen.hp);
        // 多线程同步问题指的是多个线程同时修改一个数据的时候，导致的问题

        // 假设盖伦有4000滴血，并且在基地里，同时又被对方多个英雄攻击
        // 用JAVA代码来表示，就是有多个线程在减少盖伦的hp
        // 同时又有多个线程在恢复盖伦的hp

        Thread[] addThreads = new Thread[N];
        Thread[] reduceThreads = new Thread[N];

        // n个线程增加盖伦的hp
        for (int i = 0; i < N; i++) {
            Thread t = new Thread() {
                public void run() {
                    garen.recover();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            addThreads[i] = t;
        }

        // n个线程减少盖伦的hp
        for (int i = 0; i < N; i++) {
            Thread t = new Thread() {
                public void run() {
                    garen.hurt();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            reduceThreads[i] = t;
        }
        for (Thread thread : addThreads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (Thread thread : reduceThreads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量变成了 %.0f%n", N, N, garen.hp);

    }
}