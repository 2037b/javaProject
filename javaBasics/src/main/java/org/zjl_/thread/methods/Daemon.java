package org.zjl_.thread.methods;

public class Daemon {
    static int second;

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            // 循环执行必须有while；
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("已经开始%d秒%n", second++);
            }
        });
        // 如果一个进程只剩下守护线程，那么进程就会自动结束。
        t.setDaemon(true);
        t.start(); // start()将不会执行
    }
}
