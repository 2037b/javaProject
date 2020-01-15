package org.zjl_.thread.creationThread;

import org.zjl_.thread.charactor.Hero;

class TestKillThread {
    public static void main(String[] args) {
        Hero garen = new Hero("盖伦", 5000, 400);
        Hero teemo = new Hero("提莫", 3500, 500);
        Hero yasuo = new Hero("亚索", 4500, 600);
        Hero leesin = new Hero("盲僧", 4500, 600);

        // 启动线程办法： 实例化一个继承自线程类的对象，并且调用其start()方法
        // 就可以观察到 赏金猎人攻击盲僧的同时，盖伦也在攻击提莫
        ExtendsThread kill_ExtThread1 = new ExtendsThread(garen, teemo);
        kill_ExtThread1.start();
        ExtendsThread kill_ExtThread2 = new ExtendsThread(yasuo, leesin);
        kill_ExtThread2.start();
    }
}

// 创建多线程三种方法之 ： 继承线程类(Thread)，并且重写run()方法；
public class ExtendsThread extends Thread {
    private Hero h1;
    private Hero h2;

    ExtendsThread(Hero h1, Hero h2) {
        this.h1 = h1;
        this.h2 = h2;
    }

    @Override
    public void run() {
        while (!h2.isDead()) {
            h1.attackHero(h2);
        }
    }
}
