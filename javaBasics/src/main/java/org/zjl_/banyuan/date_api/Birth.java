package org.zjl_.banyuan.date_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Birth {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy年MM月dd日HH时");

        System.out.println("今天是：" + formatDate.format(new Date()));
        System.out.println("输入你的出生日期  格式:xxxx年xx月xx日xx时");

        String birthday = scanner.next();

        System.out.println("已出生：" +
                (new Date().getTime() - formatDate.parse(birthday).getTime()) / 1000 / 60 / 60 / 24 +
                "天  " + (new Date().getTime() - formatDate.parse(birthday).getTime()) / 1000 / 60 / 60 +
                "时");
    }
}
