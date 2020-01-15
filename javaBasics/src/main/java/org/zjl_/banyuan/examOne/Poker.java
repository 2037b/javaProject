package org.zjl_.banyuan.examOne;

import java.util.ArrayList;

public class Poker {

  public static void main(String[] args) {
    start();
  }

  static void start() {
    int temp;
    ArrayList<String> cards = new ArrayList<>();
    ArrayList<String> farmer1 = new ArrayList<>();
    ArrayList<String> farmer2 = new ArrayList<>();
    ArrayList<String> landlord = new ArrayList<>();
    ArrayList<String> landlordCards = new ArrayList<>();

//        添加扑克牌；
      for (int i = 0; i < 4; i++)
          cards.add("A");
      for (int i = 2; i < 14; i++)
          for (int j = 0; j < 4; j++) {
              cards.add(String.valueOf(i));
          }
    cards.add("joker");
    cards.add("JOKER");

//        设置外层循环；
    outer:
    for (int i = 0; i < 3; i++)
        do {
            int temprature = (int) (Math.random() * 54);
            if (temprature < cards.size()) {
                landlordCards.add(cards.get(temprature));
                cards.remove(temprature);
//                    跳出此次外层循环并进行下一次循环；
                continue outer;
            }
        } while (true);

//        显示地主牌；
    System.out.println(landlordCards);

//        开始发牌；
    for (int i = 0; i < 17; i++) {
      do {
        temp = (int) (Math.random() * 51);
        if (temp < cards.size()) {
          landlord.add(cards.get(temp));
          cards.remove(temp);
          break;
        }
      } while (true);
      do {
        temp = (int) (Math.random() * 51);
        if (temp < cards.size()) {
          farmer1.add(cards.get(temp));
          cards.remove(temp);
          break;
        }
      } while (true);
      do {
        temp = (int) (Math.random() * 51);
        if (temp < cards.size()) {
          farmer2.add(cards.get(temp));
          cards.remove(temp);
          break;
        }
      } while (true);
    }

//        把地主牌给地主；
    for (int i = 0; i < 3; i++)
        landlord.add(landlordCards.get(i));

//        显示各个玩家牌组；
    System.out.println("地主牌：");
    System.out.println(landlord);
    System.out.println("农民1牌：");
      for (String i : farmer1)
          System.out.print(i + "  ");
    System.out.println(" ");
    System.out.println("农民2牌");
      for (String i : farmer2)
          System.out.print(i + "  ");
//        System.out.println(" ");
//        System.out.println(landlord.size()+" "+farmer1.size()+" "+farmer2.size());
  }
}

