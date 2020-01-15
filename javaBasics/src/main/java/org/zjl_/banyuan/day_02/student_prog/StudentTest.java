package org.zjl_.banyuan.day_02.student_prog;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        double totalScore = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入班级个数：");
        int classNum = scan.nextInt();

        System.out.print("请输入每个班级的学生人数：");
        int studentNum = scan.nextInt();

        double avg = 0;

        double[] savg = new double[classNum];

        GradeScore[] gradeScore = new GradeScore[studentNum];
        Student[][] students = new Student[classNum][studentNum];

        for (int i = 0; i < classNum; i++) {
            for (int j = 0; j < studentNum; j++) {

                Student stu = new Student();

                stu.setClassId(i);

                System.out.print("请输入第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的学号:");
                stu.setStudentId(scan.nextInt());

                System.out.print("请输入第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的姓名:");
                stu.setStudentName(scan.next());

                System.out.print("请输入第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的年龄:");
                stu.setAge(scan.nextInt());

                System.out.print("请输入第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的成绩:");
                double score = scan.nextDouble();
                stu.setScore(score);

                totalScore += score;
                students[i][j] = stu;
            }
            GradeScore gradeScore1 = new GradeScore();
            gradeScore1.setGradeClass(students[i][0].getClassId());

            //求每个班级的平均分
            avg = totalScore / studentNum;
            savg[i] = avg;   //di  i  个班级的平均分   如果引用 GradeScore类 此行注释

            gradeScore1.setAvg(avg);
            totalScore = 0;   //每个班级的总分必须得重新统计   所以计算分数得重新归零

            gradeScore[i] = gradeScore1;

        }
        //  students对象地址的传递；
        Tools.sortByAge(students, classNum, studentNum);
        Tools.sortByAvg(classNum, studentNum, savg);
    }
}
