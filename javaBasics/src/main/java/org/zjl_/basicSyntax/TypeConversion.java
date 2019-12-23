package org.zjl_.basicSyntax;

public class TypeConversion {
//    对于简单类型变量，是无法直接获得变量类型的；
//    要想获取，必须自定义函数进行返回
//    对于包装类型变量，是可以直接获得的，变量名称.getClass().getName();

    public static void main(String[] args) {
        short a = 1;
        short b = 2;
        short c = (short) (a + b);
        System.out.println(getType(a + b));
        System.out.println(getType(c));
    }

    public static String getType(Object o) { //获取变量类型方法
        return o.getClass().getTypeName(); //使用Integer类型的getClass()方法
//        return o.getClass().toString();
    }
}
