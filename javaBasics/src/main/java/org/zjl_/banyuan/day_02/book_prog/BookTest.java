package org.zjl_.banyuan.day_02.book_prog;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setTitle("鲁滨逊漂流记");
        b1.setPageNum(188);
        System.out.println(b1.detail());
    }
}
