package org.zjl_.thread.creationThread;

import org.zjl_.thread.charactor.Hero;

//    进程(Processor)：启动一个LOL.exe就叫一个进程。 接着又启动一个DOTA.exe，这叫两个进程。
//    线程(Thread)：线程是在 进程 内部 同时做的事情，比如在LOL里，有很多事情要同时做，
//    比如"盖伦” 击杀“提莫”，同时“亚索”又在击杀“盲僧”，这就是由多线程来实现的。

//  这是一个单线程的运行情况；
public class SingleThread {
    public static void main(String[] args) {
        Hero garen = new Hero("盖伦", 5000, 400);
        Hero teemo = new Hero("提莫", 3500, 500);
        Hero yasuo = new Hero("亚索", 4500, 600);
        Hero leesin = new Hero("盲僧", 4500, 600);
        while (!teemo.isDead()) garen.attackHero(teemo);
        while (!leesin.isDead()) yasuo.attackHero(leesin);
    }
}