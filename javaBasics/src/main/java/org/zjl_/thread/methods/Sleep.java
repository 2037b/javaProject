package org.zjl_.thread.methods;

public class Sleep {
    static int second;

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                //  循环执行必须有while；
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("已经开始%d秒%n", second++);
                }
            }
        }.start();
    }
}
