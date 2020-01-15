package org.zjl_.banyuan.homework;

/*1.模拟在校学生选课系统,使用集合完成

要求：
1.学生类:学号，姓名，所选课程Set<Course>
学生可以对课程做增删改查操作

2.课程类：编号 课程名称

3.学生选课清单类

完成:有n个人 显示出每个人所选的课程信息
如：姓名：张三:    所选课程如下： 9527  java基础 ，9768 C# ，9898 javaScript 等
*/

import java.util.*;

public class StudentCourse {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.stuId = "1001";
        stu1.stuName = "张三";
        Course course1 = new Course("9528", "C++ Programming");
        stu1.stuCourse.add(new Course("9527", "C Programming"));
        stu1.stuCourse.add(new Course("9529", "Java Programming"));
        stu1.stuCourse.add(course1);
        System.out.println(stu1.search("9521"));
        System.out.println(stu1.stuCourse.remove(course1));
        System.out.println(stu1.search("9527"));
        System.out.println(stu1.search("9528"));
        System.out.println(stu1.stuCourse);
    }
}

class Course {
    String courseId;
    String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String add() {
        return null;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}

class Student {
    String stuId;
    String stuName;
    Set<Course> stuCourse = new Set<Course>() {
        Course[] courseArr = new Course[0];
        int size;

        @Override
        public int size() {
            return size;
        }

        @Override
        public boolean isEmpty() {
            if (courseArr == null) {
                return true;
            }
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Course> iterator() {
            return new Iterator<Course>() {
                int nextIndex = -1;

                @Override
                public boolean hasNext() {
                    /*if (nextIndex+1<size)
                    return true;
                    return false;*/
                    return nextIndex + 1 < size;
                }

                @Override
                public Course next() {
                    nextIndex++;
                    return courseArr[nextIndex];
                }
            };
        }

        @Override
        public Object[] toArray() {
            return null;
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Course course) {
            courseArr = Arrays.copyOf(courseArr, courseArr.length + 1);
            courseArr[courseArr.length - 1] = course;
            size++;
            return true;
        }

        @Override
        public boolean remove(Object o) {
//            ((Course)o).add();
            for (int i = 0; i < size; i++) {
                if (courseArr[i].equals(o)) {
                    for (int j = i; j < size; j++) {
                        if (j + 1 != size)
                            courseArr[j] = courseArr[j + 1];
                        if (j == size - 1) {
                            courseArr[j] = null;
                            size--;
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Course> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public String toString() {
            return Student.this.toString() + "\n" + "$classname{" +
                    "courseArr=" + Arrays.toString(courseArr) +
                    '}';
        }
    };

    public String search(String courseId) {
        Iterator<Course> it = stuCourse.iterator();
        while (it.hasNext()) {
            Course tempCourse = it.next();
            if (tempCourse.courseId == courseId) {
                return this.toString() + tempCourse.toString();
            }
        }
        return "not found";
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                '}';
    }
}
