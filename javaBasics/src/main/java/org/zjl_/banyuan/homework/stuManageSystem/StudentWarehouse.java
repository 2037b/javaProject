package org.zjl_.banyuan.homework.stuManageSystem;

import java.util.Objects;

public class StudentWarehouse implements Comparable<StudentWarehouse> {
    private int stuId;
    private String stuName;
    static int newId;

    public StudentWarehouse(String stuName) {
        this.stuId = ++newId;
        this.stuName = stuName;
    }

    public StudentWarehouse(int stuId, String stuName) {
        this(stuName);
        this.stuId = stuId;
        newId = stuId;
    }

    @Override
    public int compareTo(StudentWarehouse o) {

        if (this.stuId > o.stuId)
            return 1;
        if (this.stuId < o.stuId)
            return -1;

        else {
            return this.stuName.compareTo(o.stuName);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentWarehouse that = (StudentWarehouse) o;
        return stuId == that.stuId &&
                stuName.equals(that.stuName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuId, stuName);
    }

    @Override
    public String toString() {
        return "StudentWarehouse{" +
                "stuId=" + stuId +
                ", StuName='" + stuName + '\'' +
                '}';
    }
}
