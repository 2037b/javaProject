package org.zjl_.banyuan.string_api;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToString {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] by = {65, 67, 68, 97, 98, 101};
        System.out.println(new String(by));
        System.out.println(new String(by, 2, 3));
        System.out.println(new String(by, "UTF-8"));
        String s = new String(by, "UTF-8");
        System.out.println(Arrays.toString(s.getBytes("UTF-8")));
        String s2 = new String(by, "UTF-8");
        System.out.println(Arrays.toString(s2.getBytes("UNICODE")));
        System.out.println(Arrays.toString(new String(by, "UTF-8").getBytes("GBK")));
    }
}
