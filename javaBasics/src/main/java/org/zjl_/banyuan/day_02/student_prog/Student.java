package org.zjl_.banyuan.day_02.student_prog;

public class Student {
    private int studentId;
    private String studentName;
    private int age;
    private int classId;
    private double score;

    public Student() {
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public int getClassId() {
        return classId;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", classId=" + classId +
                ", score=" + score +
                '}';
    }
}
