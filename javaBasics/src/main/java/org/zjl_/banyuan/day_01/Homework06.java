package org.zjl_.banyuan.day_01;

/*String a ="aa";
int c = 555;
String b = a+"bbb"+c;
double d = 5.66600;
int e = (int) d;
int f = 3;
double g = 3.53;
float h = 1.7f;
int i = 1;
System.out.println(b);
System.out.println(e);
System.out.println( f/i );
System.out.println( g/f);
System.out.println( h/f );
System.out.println(  9.5<8 );
System.out.println( (int)'a' +  (int)'z' );
System.out.println("A~Z："+((int)'A')+"~"+((int)'Z'));
System.out.println("'A' < 'a':"+('A' < 'a'));
System.out.println(6 & 3);
System.out.println(6 & 2);
System.out.println(6 | 3);
System.out.println(6 | 2);
System.out.println(6 ^ 3);
System.out.println(6 ^ 2);
System.out.println(~6);*/
public class Homework06 {
    public static void main(String[] args) {
        String a = "aa";
        int c = 555;
        String b = a + "bbb" + c;
        double d = 5.66600;
        int e = (int) d;
        int f = 3;
        double g = 3.53;
        float h = 1.7f;
        int i = 1;
        System.out.println(b);
        System.out.println(e);
        System.out.println(f / i);
        System.out.println(g / f);
        System.out.println(h / f);
        System.out.println(9.5 < 8);
        System.out.println((int) 'a' + (int) 'z');
        System.out.println("A~Z：" + ((int) 'A') + "~" + ((int) 'Z'));
        System.out.println("a~z：" + ((int) 'a') + "~" + ((int) 'z'));
        System.out.println("'A' < 'a':" + ('A' < 'a'));
        System.out.println(6 & 3);
        //位与运算符：两个数都转为二进制，然后从高位开始比较，如果两个数都为1则为1，否则为0。
        //6:110,3:011,结果为10,按十进制输出。
        System.out.println(6 & 2);
        System.out.println(6 | 3);
        //位或运算符：两个数都转为二进制，然后从高位开始比较，两个数只要有一个为1则为1，否则就为0。
        System.out.println(6 | 2);
        System.out.println(6 ^ 3);
//        位异或运算符：两个数转为二进制，然后从高位开始比较，如果相同则为0，不相同则为1。
        System.out.println(6 ^ 2);
        System.out.println(~6);
//        位非运算符：如果位为0，结果是1，如果位为1，结果是0。
        //转化为十进制输出则高位（符号位）不变，按位取反并+1。
    }
}
