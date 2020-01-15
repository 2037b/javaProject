package org.zjl_.banyuan.string_api;

public class StringBuffer_String {
    public static void main(String[] args) {
        String str = "def";
        System.out.println(str.hashCode());

        str = str.concat("ssss");
        System.out.println(str.hashCode());

        StringBuffer strbuff = new StringBuffer("abc");
        System.out.println(strbuff.hashCode());

        strbuff.append("xyz");
        System.out.println(strbuff.hashCode());
    }
}
