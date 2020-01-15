package org.zjl_.banyuan.day_01;

/*
int x = 4;
int y =(x++)+(++x)+(x*10);
System.out.println("x="+x+",y="+y);
求出x  y的值
*/
public class Homework02 {
    public static void main(String[] args) {
        int x = 4;
        int y = (x++) + (++x) + (x * 10);      //x==6;y==(4+6+60);
        System.out.println("x=" + x + ",y=" + y);
    }
}
