package org.zjl_.banyuan.homework;


import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(strPartReverse(new Scanner(System.in).next(),
                new Scanner(System.in).nextInt(),
                new Scanner(System.in).nextInt()));

//        .nextLine() 读到空格不会停止，可以读取空格；
        System.out.println(strReverse(new Scanner(System.in).nextLine()));
    }

    static String strPartReverse(String str, int start, int end) {
        StringBuffer strBuff = new StringBuffer(str.substring(start, end));
        return str.replace(str.substring(start, end), strBuff.reverse());
    }

    static String strReverse(String str) {
        String newStr = "";
        String[] tempStr = str.split(" ");
        for (int i = 0; i < tempStr.length; i++) {
            newStr += new StringBuffer(tempStr[i]).reverse().toString();
            newStr += " ";
        }
        return newStr;
    }
}
