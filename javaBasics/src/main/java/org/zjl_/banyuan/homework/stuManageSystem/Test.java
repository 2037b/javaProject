package org.zjl_.banyuan.homework.stuManageSystem;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<StudentWarehouse> stuWH = new TreeSet<>();
        stuWH.add(new StudentWarehouse(9527, "张三"));
        StudentWarehouse ls = new StudentWarehouse("李四");
        stuWH.add(ls);
        stuWH.add(new StudentWarehouse("王五"));
        stuWH.add(new StudentWarehouse("赵六"));
        stuWH.remove(ls);
        Iterator it = stuWH.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
