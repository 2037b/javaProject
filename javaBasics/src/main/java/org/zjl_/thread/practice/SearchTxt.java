package org.zjl_.thread.practice;

import java.io.*;

//  进程 仅仅是一个容器，包含了 线程 运行中所需要的数据结构等信息。
//  线程 是程序最基本的运行单位，而 进程 不能运行，所以能运行的，是 进程 中的 线程。
//  一个 进程 创建时，操作系统会创建一个 线程，这就是 主线程，
//  main()方法既是 主线程，也是 主进程，
//  而其他的 从线程，却要 主线程 的代码来创建，也就是由程序员来创建。
class TestSearchTxt {
    public static void main(String[] args) {
        File file = new File("src/");
        start(file, "杨辉三角");
    }

    static void start(File file, String string) {
        if (file.isFile()) {
            if (file.getAbsolutePath().toLowerCase().endsWith(".java"))
                new Thread(new SearchTxt(file, string)).start();
        } else if (file.isDirectory()) {
            File[] fileArr = file.listFiles();
            for (File newFile : fileArr) {
                start(newFile, string);
            }
        }
    }
}

public class SearchTxt implements Runnable {
    private File file;
    private String string;

    public SearchTxt(File file, String string) {
        this.file = file;
        this.string = string;
    }

    @Override
    public void run() {
        try (FileReader fr = new FileReader(file)) {
            char[] all = new char[(int) (file.length())];
            fr.read(all);
            String str = new String(all);
            if (str.contains(string))
//                f代表formatted
                System.out.printf("找到字符串%s,在文件%s中%n", string, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}