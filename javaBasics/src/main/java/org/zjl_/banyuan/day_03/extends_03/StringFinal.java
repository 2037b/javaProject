package org.zjl_.banyuan.day_03.extends_03;

public class StringFinal {
    int a = 2;

    public static void final_1() {
        String a = "ab";
        String bb = "b";
        String b = "a" + bb; //编译器不能确定为常量
        System.out.println(a == b);
    }//false

    void final_2() {
        String a = "a1";//“a1”在编译的时候就能确定，所以编译的时候，a1被放进了常量池中，同时a指向常量池中的a1对象
        String b = "a" + 1;//a和1这两个常量都能在编译时确定，所以他们相加的结果也能确定，因此编译器检查常量池中是否有值为a1的String对象，发现有了，因此b也指向常量池中的a1对象
        System.out.println(a == b);//==判断的是a和b是否指向同一个对象，也就是同一块内存区域
    }//true

    void final_3() {
        String a = "ab";
        final String bb = "b";
        String b = "a" + bb; //bb加final后是常量，可以在编译器确定b
        System.out.println(a == b);
    }//true

    void final_4() {
        String a = "ab";
        //  非static方法可以直接调用同类方法；
        final String bb = getBB();
        //  bb是通过函数返回的，虽然知道它是final的，但不知道具体是啥，要到运行期才知道bb的值。
        String b = "a" + bb;
        System.out.println(a == b);
    }//false

    private static String getBB() {
        return "b";
    }

    public static void main(String[] args) {
        //  静态方法可直接通过类调用；
        StringFinal.final_1();
        //  static方法中不能通过this.来调用类方法；
        new StringFinal().final_2();
        new StringFinal().final_3();
        new StringFinal().final_4();
    }
}
