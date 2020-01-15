package org.zjl_.thread.concurrency;

import org.zjl_.thread.charactor.Hero;

public class GetKnowSynchronized {

    public static void main(String[] args) {
        final int N = 10000;
        final Object someObject = new Object();
        final Hero garen = new Hero("盖伦", 10000, 300);
        System.out.printf("%s的初始血量是：%.0f%n", garen.name, garen.hp);

        Thread[] addThreads = new Thread[N];
        Thread[] reduceThreads = new Thread[N];

        for (int i = 0; i < N; i++) {
            Thread t = new Thread() {
                public void run() {
                    // synchronized (someObject) {
                    synchronized (garen) {
                        garen.recover();
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    // }
                }
            };
            t.start();
            addThreads[i] = t;
        }

        for (int i = 0; i < N; i++) {
            Thread t = new Thread() {
                public void run() {
                    // synchronized (someObject) {
                    synchronized (garen) {
                        garen.hurt();
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    // }
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
