package org.zjl_.banyuan.day_02;

import java.math.BigInteger;
import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.print("请输入十进制数：");
        //将()内的int类型转化为二进制字符串   parseInt和valueOf效果一样；
        int a = Integer.parseInt(Integer.toBinaryString(new Scanner(System.in).nextInt()));
        System.out.println("转化成二进制的结果为：" + a);
        //方法二：
        //转换成BigInteger类型
        BigInteger n = new BigInteger(String.valueOf(new Scanner(System.in).next()));
        System.out.println(n.toString(2));    //参数2指定的是转化成X进制，默认10进制
    }
}
