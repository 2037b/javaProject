package org.zjl_.thread.interaction;

import org.zjl_.thread.charactor.Hero;

public class WaitMethod {

  public static void main(String[] args) {
    final Hero garen = new Hero("盖伦", 6000, 300);

    Thread t1 = new Thread() {
      @Override
      public void run() {
        while (true) {

          //无需循环判断
          //while(gareen.hp==1){
          //continue;
          //}

          garen.hurt();
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }

      }
    };
    t1.start();

    Thread t2 = new Thread() {
      @Override
      public void run() {
        while (true) {
          garen.recover();
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      }
    };
    t2.start();
  }
}
