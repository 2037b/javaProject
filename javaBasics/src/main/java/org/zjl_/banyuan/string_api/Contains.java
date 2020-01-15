package org.zjl_.banyuan.string_api;

public class Contains {
    public static void main(String[] args) {
        String sword = "我是你的谁,我是你的剑";
        System.out.println(sword.contains("剑"));
        System.out.println(sword.startsWith("我是你"));
        System.out.println(sword.endsWith("剑"));
    }
}
