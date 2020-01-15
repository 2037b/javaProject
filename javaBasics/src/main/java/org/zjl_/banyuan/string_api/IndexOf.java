package org.zjl_.banyuan.string_api;

public class IndexOf {
    public static void main(String[] args) {
        String sword = "我是你的谁,我是你的剑";
        System.out.println(sword.indexOf("你"));
        System.out.println(sword.indexOf("你", 4));
        System.out.println(sword.lastIndexOf("你"));
        System.out.println(sword.substring(2, 5));
        System.out.println(sword.trim());
        System.out.println(sword.replace("谁", "被子"));
        System.out.println(sword.replace("你", "哈"));
    }
}
