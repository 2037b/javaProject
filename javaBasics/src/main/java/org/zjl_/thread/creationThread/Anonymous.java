package org.zjl_.thread.creationThread;

import org.zjl_.thread.charactor.Hero;

public class Anonymous {
    public static void main(String[] args) {
        Hero garen = new Hero("盖伦", 5000, 400);
        Hero teemo = new Hero("提莫", 3500, 500);
        Hero yasuo = new Hero("亚索", 4500, 600);
        Hero leesin = new Hero("盲僧", 4500, 600);

//        使用匿名类，继承Thread,重写run方法，直接在run方法中写业务代码，
//        匿名类的一个好处是可以很方便的访问外部的局部变量。
//        Thread已实现过Runnable接口
        Thread thread_1 = new Thread(){
            @Override
            public void run() {
                while (!teemo.isDead())
                    garen.attackHero(teemo);
            }
        };
        Thread thread_2 = new Thread(() -> {
            while(!leesin.isDead())
                yasuo.attackHero(leesin);
        });
        thread_1.start();
        thread_2.start();
    }
}
