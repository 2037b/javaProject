package org.zjl_.banyuan.homework;

public class StringAddLetter {
    public static void main(String[] args) {
        StringBuffer strBuff = new StringBuffer();
        char a = 'a';
        for (int i = 0; i < 26; i++) {
            strBuff.append(a);
            a++;
        }
        StringBuffer buff = strBuff;
        System.out.println(strBuff.reverse());
        System.out.println(buff.delete(0, 5));
    }
}
