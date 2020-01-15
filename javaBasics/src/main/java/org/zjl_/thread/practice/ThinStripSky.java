package org.zjl_.thread.practice;

public class ThinStripSky implements Runnable {
    static int count;
    Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            try {
                Thread.sleep(1000);
                System.out.format("%s第%d个通过\n",
                        Thread.currentThread().getName(), ++count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
