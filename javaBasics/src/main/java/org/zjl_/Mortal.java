package org.zjl_;

public interface Mortal {

  void mortal();

  default void print() {
    System.out.println("mortal");
  }
}
