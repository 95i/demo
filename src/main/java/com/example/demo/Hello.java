package com.example.demo;


import com.smtxi.Student;

public class Hello {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "张三";
        student.age = 18;
        student.english = 60;
        student.math = 60;
        student.chinese = 70;
        System.out.println(student.name + "\n" + student.age + "岁");
        System.out.println("三门成绩总和:" + student.total());
        System.out.println("平均值:" + student.average());
    }
}
