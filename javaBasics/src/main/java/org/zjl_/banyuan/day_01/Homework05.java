package org.zjl_.banyuan.day_01;

/*
int x = 5, y = 6, z;
        A.z = ++x + y++;
        B.z = ++x + x++;
        C.x = ++x + x++；
        D.z = x > y ? ++x : y++;
        输出ABCD题目中x、y、z的值
*/
public class Homework05 {
    public static void main(String[] args) {
        int x = 5, y = 6, z;
    /*    z = ++x + y++;      //z=12;
        System.out.println("z=" + z);*/
        /*z = ++x + x++;      //z=12;
        System.out.println("z=" + z);*/
        /*z = x > y ? ++x : y++;  //z=6;
        System.out.println("z=" + z);*/
        x = ++x + x++;          //x=12;
        System.out.println("x=" + x);
    }
}
