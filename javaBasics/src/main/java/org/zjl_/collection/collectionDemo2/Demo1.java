package org.zjl_.collection.collectionDemo2;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {

  public static void main(String[] args) {
    Collection collection = new ArrayList();
    collection.add("哈沙给");
    collection.add(123);
    collection.add(34.6);
    collection.add(true);
    collection.add('a');

//        Iterator in =collection.iterator();
//        while(in.hasNext()){
//            System.out.println(in.next());
//        }
    Collection collection2 = new ArrayList();

    collection.retainAll(collection2);
    System.out.println(collection);
    System.out.println(collection2);


  }


}
