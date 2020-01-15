package org.zjl_.thread.methods;

import org.zjl_.thread.charactor.Hero;

public class Yield {
    public static void main(String[] args) {
        Hero garen = new Hero("盖伦", 4500, 500);
        Hero teemo = new Hero("提莫", 4500, 500);
        Hero yasuo = new Hero("亚索", 4500, 500);
        Hero leesin = new Hero("盲僧", 4500, 500);
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
                    // 使用了yield()，main()方法不会结束；
                    Thread.yield();
                yasuo.attackHero(leesin);
            }
        };
        t1.setPriority(5);
        t2.setPriority(5);
        t1.start();
        t2.start();
    }
}
