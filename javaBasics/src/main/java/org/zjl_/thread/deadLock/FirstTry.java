package org.zjl_.thread.deadLock;

import org.zjl_.thread.charactor.Hero;

public class FirstTry {
    public static void main(String[] args) {
        Hero ahri = new Hero("阿狸", 3500, 700);
        Hero annie = new Hero("安妮", 3700, 600);
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                synchronized (ahri) {
                    System.out.println("thread1已占有阿狸");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println("thread1试图占有安妮");
                    System.out.println("thread1等待中......");
                    synchronized (annie) {
                        System.out.println("thread1已占有安妮");
                    }
                }
            }
        };
        thread1.start();
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                synchronized (annie) {
                    System.out.println("thread2已占有安妮");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println("thread2试图占有阿狸");
                    System.out.println("thread2等待中......");
                    synchronized (ahri) {
                        System.out.println("thread2已占有阿狸");
                    }
                }
            }
        };
        thread2.start();
    }
}