package org.zjl_.thread.creationThread;

import org.zjl_.thread.charactor.Hero;

class TestBattle {
    public static void main(String[] args) {
        Hero garen = new Hero("盖伦", 5000, 400);
        Hero teemo = new Hero("提莫", 3500, 500);
        Hero yasuo = new Hero("亚索", 4500, 600);
        Hero leesin = new Hero("盲僧", 4500, 600);

        // 启动的时候，首先创建一个Battle对象，
        // 然后再根据该battle对象创建一个线程对象，并启动。
        ImplementsRun battle_ImpRun_1 = new ImplementsRun(garen, teemo);
        ImplementsRun battle_ImpRun_2 = new ImplementsRun(yasuo, leesin);

        // battle1 对象实现了Runnable接口，所以有run方法，
        // 但是直接调用run方法，并不会启动一个新的线程。
        // 必须，借助一个线程对象的start()方法，才会启动一个新的线程。
        // 所以，在创建Thread对象的时候，把battle1作为构造方法的参数传递进去，
        // 这个线程启动的时候，就会去执行battle1.run()方法了。
        new Thread(battle_ImpRun_1).start();
        new Thread(battle_ImpRun_2).start();
    }
}

// 创建多线程三种方法之 ： 创建类，并且实现Runnable接口；(Thread类也实现了Runnable接口)
public class ImplementsRun implements Runnable {
    private Hero h1;
    private Hero h2;

    ImplementsRun(Hero h1, Hero h2) {
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
