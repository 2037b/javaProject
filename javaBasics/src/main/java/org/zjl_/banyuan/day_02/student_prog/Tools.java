package org.zjl_.banyuan.day_02.student_prog;

public class Tools {
    public static void sortByAge(Student[][] students, int classNum, int studentNum) {
        for (int i = 0; i < classNum; i++) {
            for (int j = 0; j < studentNum; j++) {
                System.out.println("第" + (i + 1) + "个班级的学生有：" + students[i][j]);
            }

            for (int j = 0; j < studentNum - 1; j++) {
                for (int k = 0; k < studentNum - 1 - j; k++) {
                    if (students[i][k].getAge() > students[i][k + 1].getAge()) {
                        Student temp = students[i][k];
                        students[i][k] = students[i][k + 1];
                        students[i][k + 1] = temp;
                    }
                }
            }
            System.out.println("----modify-------");

            for (int j = 0; j < studentNum; j++) {
                System.out.println("第" + (i + 1) + "个班级的学生有：" + students[i][j]);
            }

            System.out.println("----next class---");
        }
    }

    public static void sortByAvg(int classNum, int studentNum, double[] savg) {
        System.out.println("------按平均分排序-------");

        for (int j = 0; j < studentNum - 1; j++) {
            for (int k = 0; k < studentNum - 1 - j; k++) {
                if (savg[j] < savg[j + 1]) {
                    double score = savg[j];
                    savg[j] = savg[j + 1];
                    savg[j + 1] = score;
                }
            }
        }
        for (int i = 0; i < savg.length; i++) {
            System.out.print(savg[i] + " ");
        }
    }
}
