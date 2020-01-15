package org.zjl_.thread.charactor;

public class Hero {

  public String name;
  public float hp;
  public int damage;

  public Hero(String name, int hp, int damage) {
    this.name = name;
    this.hp = hp;
    this.damage = damage;
  }

  // 在recover前，直接加上synchronized ，其所对应的同步对象，就是this
  // 和hurt方法达到的效果是一样
  // 外部线程访问gareen的方法，就不需要额外使用synchronized 了

  // 直接在方法前加上修饰符synchronized
  // 其所对应的同步对象，就是this
  public synchronized void recover() {
    hp = hp + 1;
    System.out.printf("%s 回血1点,增加血后，%s的血量是%.0f%n", name, name, hp);
    // 通知那些等待在this对象上的线程，可以醒过来了，
    // 如hurt()方法中的，等待着的减血线程，苏醒过来
    this.notify();
  }

  public void hurt() {
      if (hp == 1)
          try {
              // 让占有this的减血线程，暂时释放对this的占有，并等待
              this.wait();
          } catch (InterruptedException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }
    // 使用this作为同步对象
    synchronized (this) {
      hp = hp - 1;
    }
    System.out.printf("%s 减血1点,减少血后，%s的血量是%.0f%n", name, name, hp);
  }


  public void attackHero(Hero hero) {
    try {
      // Thread.sleep()未必只能写在run()方法中
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    if (hero.hp - this.damage > 0) {
      hero.hp -= this.damage;
      System.out.format("%s正在攻击%s，%s剩余血量：%.0f%n", this.name, hero.name, hero.name, hero.hp);
    } else {
      hero.hp = 0;
      System.out.println(hero.name + "is dead");
    }
  }

  public boolean isDead() {
    return hp == 0;
  }
}
