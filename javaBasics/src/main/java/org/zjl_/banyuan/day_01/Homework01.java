package org.zjl_.banyuan.day_01;

/*int a = 10;
        int b = 10;
        int c = 10;
        a = b++;
        c = --a;
        b = ++a;
        a = c--;
        System.out.println("a="+a+",b="+b+",c="+c);
        求出a  b  c的值*/
public class Homework01 {
    public static void main(String[] args) {
        int a = 10; //多余的初始化；
        int b = 10;
        int c = 10;
        a = b++;    //a==10,b=11;
        c = --a;    //c==9,a==9;
        b = ++a;    //b==10,a=10;
        a = c--;    //a==9,c=8;
        System.out.println("a=" + a + ",b=" + b + ",c=" + c);
    }
}
