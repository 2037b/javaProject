package org.zjl_;

public abstract class Hero implements Mortal {

  public abstract void attack();

  public static void main(String[] args) {

    //在匿名类中使用外部的局部变量，外部的局部变量必须修饰为final
    int damage = 700;

    Hero h = new Hero() {
      @Override
      public void attack() {
        System.out.printf("新的进攻手段，造成%d点伤害", damage);
      }

      @Override
      public void mortal() {

      }
    };
    h.attack();
    Mortal h2 = new Hero() {
      @Override
      public void attack() {
        System.out.println("dfd");
      }

      @Override
      public void mortal() {
        System.out.println("dfdsf");
      }
    };


  }

}
