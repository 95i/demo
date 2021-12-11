package com.example.demo;

public class Student {
    String name;
    int age;
    int chinese;
    int math;
    int english;

    int total() {
        return chinese + math + english;
    }

    double average() {
        return total() / 3;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "张三";
        student.age = 18;
        student.english = 60;
        student.math = 60;
        student.chinese = 70;
        System.out.println(student.name + "\n" + student.age+"岁");
        System.out.println("三门成绩总和:"+student.total());
        System.out.println("平均值:"+student.average());
    }

}
