package org.zjl_.thread.practice;

public class Test{
    public static void main(String[] args) {
//        int count=0;
//        ThinStripSky tss=new ThinStripSky();
//        for (int i = 0; i < 10; i++) {
//            new Thread(tss,"探险家"+(++count)).start();
//        }
        Bank tb=new Bank();
        new Thread(tb,"A").start();
        new Thread(tb,"B").start();
    }
}
