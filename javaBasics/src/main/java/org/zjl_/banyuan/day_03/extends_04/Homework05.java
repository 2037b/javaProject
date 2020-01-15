package org.zjl_.banyuan.day_03.extends_04;

class Homework05 {
    public static void main(String[] args) {
        Person jesus = new Person();
        jesus.setName("耶稣");
        jesus.setGender('男');
        jesus.setAge(18);
        jesus.setNationality("USA");
        System.out.println(jesus);
        jesus.eat();
        jesus.sleep();
        jesus.work();
        Student kanye = new Student();
        kanye.setName("韦斯特");
        kanye.setGender('男');
        kanye.setAge(20);
        kanye.setNationality("USA");
        System.out.println(kanye);
    }
}

class Person {
    private String name;
    private char gender;
    private int age;
    private String nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    void eat() {
        System.out.println(name + "要吃饭。");
    }

    void sleep() {
        System.out.println(name + "要睡觉。");
    }

    void work() {
        System.out.println(name + "要工作。");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

class Student extends Person {
    private String school;
    private String stuNumber;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    void work() {
        System.out.println(super.getName() + "的工作是学习。");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", gender=" + super.getGender() +
                ", age=" + super.getAge() +
                ", nationality='" + super.getNationality() + '\'' +
                "school='" + school + '\'' +
                ", stuNumber='" + stuNumber + '\'' +
                '}';
    }
}

class Worker extends Person {
    private String unit;
    private int workAge;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    void work() {
        System.out.println(super.getName() + "的工作室盖房子。");
    }
}

class StudentLeader extends Student {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    void meeting() {
        System.out.println(super.getName() + "要开会。");
    }
}
