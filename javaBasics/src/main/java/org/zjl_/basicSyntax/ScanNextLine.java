package org.zjl_.basicSyntax;
/*如果在通过nextInt()读取了整数后，再接着读取字符串，读出来的是回车换行:"\r\n",
因为nextInt仅仅读取数字信息，而不会读取回车换行"\r\n".
所以，如果在业务上需要读取了整数后，接着读取字符串，
第一次是取走回车换行，第二次才是读取真正的字符串
那么就应该连续执行两次nextLine()，*/

import java.util.Scanner;

public class ScanNextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println("整数i：" + i);
        scan.nextLine();
        String str = scan.nextLine();

//        回车return：回到当前行的行首，而不会换到下一行，
//        如果接着输出的话，本行所存在的内容将会被逐一覆盖；区别:'\n':new line;
        System.out.print("2323" + '\r');

        System.out.println("字符串str：" + str);
    }
}
