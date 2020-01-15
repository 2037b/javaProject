package org.zjl_.banyuan.day_02.book_prog;

public class Book {
    private String title;
    private int pageNum;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageNum(int pageNum) {
        if (pageNum < 200 && pageNum > 0)
            this.pageNum = pageNum;
        else {
            System.out.println("错误信息：页数不得大于200页！");
            this.pageNum = 200;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String detail() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }

//    void detail() {
//        System.out.println("《" + getTitle() + "》" + getPageNum() + "页");
//    }
}
