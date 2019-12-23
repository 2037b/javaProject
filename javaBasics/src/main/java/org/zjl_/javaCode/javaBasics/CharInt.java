package javaCode.javaBasics;

public class CharInt {
    public static void main(String[] args) {
        final char CH = 65535;
        final char CH2 = 655;

        //        编译器对常量进行了优化，数据类型自动转换；
        //        不仅小类型转大类型，大类型转小类型也没问题；

        char ch1 = CH - 1;
        ch1 = CH2 + 1;
        //        ch1 = CH + 1;
        char ch2 = 65535;
        //        ch2=65535+1;
        char ch3 = 2 + 2;
        char ch4 = ++ch3;
        ch4 = ++ch2;
        char ch5 = (char) (ch3 + 1);
        //        ch5 = ch3 + 1;
        //        ch2 = ch3 + 1;
        ch2++;
        ch2 += 1;
        ch3++;
        ch3 += 1;
    }
}

