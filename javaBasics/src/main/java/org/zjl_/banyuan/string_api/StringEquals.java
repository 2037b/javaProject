package org.zjl_.banyuan.string_api;

public class StringEquals {
    public static void main(String[] args) {
        String a = "abcdw";
        String b = "ABCDw";
        String c = "avabc";
        String d = "avab";
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(c.compareTo(d));
    }
}
