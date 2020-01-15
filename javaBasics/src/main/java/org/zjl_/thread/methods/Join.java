package org.zjl_.thread.methods;

import org.zjl_.thread.charactor.Hero;

//  .join()，即表明在主线程中加入该线程。
//  主线程会等待该线程结束完毕，才会往下运行。
public class Join {
    public static void main(String[] args) {
        Hero garen = new Hero("盖伦", 5000, 400);
        Hero teemo = new Hero("提莫", 3500, 500);
        Hero yasuo = new Hero("亚索", 4500, 600);
        Hero leesin = new Hero("盲僧", 4500, 600);
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (!teemo.isDead())
                    garen.attackHero(teemo);
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (!leesin.isDead())
                    yasuo.attackHero(leesin);
            }
        };
        t1.start();

        // 代码执行到这里，一直是main线程在运行。
        try {
            // t1线程加入到main线程中来，只有t1线程运行结束，才会继续往下走
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}