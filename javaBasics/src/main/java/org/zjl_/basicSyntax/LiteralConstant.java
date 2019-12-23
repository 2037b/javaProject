package org.zjl_.basicSyntax;

public class LiteralConstant {
    //  字面值、字面量
    public static void main(String[] args) {
        long val = 26L; //以L结尾的字面值表示long型
        int decVal = 26; //默认就是int型
        int hexVal = 0x1a; //16进制
        int oxVal = 032; //8进制
        int binVal = 0b11010; //2进制
        float f1 = 123.4F;// 以F结尾的字面值表示float类型
        double d1 = 123.4;// 默认就是double类型（以d或者D结尾，写不写都可以）
        double d2 = 1.234e2;// 科学计数法表示double：1.234x10^2
        char tab = '\t'; //制表符
        char carriageReturn = '\r'; //回车
        char newLine = '\n'; //换行
        char doubleQuote = '\"'; //双引号
        char singleQuote = '\''; //单引号
        char backslash = '\\'; //反斜杠
        System.out.println(oxVal);
    }
}
