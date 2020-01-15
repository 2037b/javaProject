package org.zjl_.banyuan.examTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapInArrayList {

  public static void main(String[] args) {
    ArrayList<HashMap<String, String>> hashMapArrayList = new ArrayList<HashMap<String, String>>();
    HashMap<String, String> hm1 = new HashMap<String, String>();
    hm1.put("周瑜", "小乔");
    hm1.put("吕布", "貂蝉");

    hashMapArrayList.add(hm1);

    HashMap<String, String> hm2 = new HashMap<String, String>();
    hm2.put("郭靖", "黄蓉");
    hm2.put("杨过", "小龙女");

    hashMapArrayList.add(hm2);

    HashMap<String, String> hm3 = new HashMap<String, String>();
    hm3.put("令狐冲", "任盈盈");
    hm3.put("林平之", "岳灵珊");

    hashMapArrayList.add(hm3);

    for (HashMap<String, String> hm : hashMapArrayList) {

      Set<String> set = hm.keySet();
      for (String key : set) {
        String value = hm.get(key);
        System.out.println(key + "---" + value);
      }
      System.out.println();
    }
  }
}
